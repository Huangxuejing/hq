package com.taidii.staffdevelopment.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taidii.staffdevelopment.commons.LoginUser;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.OptionDTO;
import com.taidii.staffdevelopment.dto.training.CourseDTO;
import com.taidii.staffdevelopment.dto.training.UserCourseHistoryDTO;
import com.taidii.staffdevelopment.dto.training.UserSummaryDTO;
import com.taidii.staffdevelopment.enums.CourseStatusEnum;
import com.taidii.staffdevelopment.service.IExportFileService;
import com.taidii.staffdevelopment.service.ITrainingService;
import com.taidii.staffdevelopment.util.ExcelUtil;

/**
 * @version 1.0
 * @description:
 *    导出文件
 * @projectName: com.taidii.staffdevelopment.controller
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/22 14:39
 */
@RestController
@RequestMapping("/api/development/export")
public class ExportFileController {

  @Autowired
  private IExportFileService exportFileService;
  
    @Autowired
    ITrainingService trainingService;
  /**
   *  导出用户评价的pdf
   * @param selfEvaluationId
   *
   * @param request
   * @param response
   * @ @author tannc
   * @create-time 2018-06-22 14:47:24
   */
  @GetMapping("pdf")
  public void exportPDF(@RequestParam(value = "selfEvaluationId",required = false) Integer selfEvaluationId,
                        HttpServletRequest request,
                        HttpServletResponse response) throws IOException {
    // 下载本地文件
    String fileName = "evaluation.pdf".toString(); // 文件的默认保存名
    String path = request.getSession().getServletContext().getRealPath(Constants.UPLOAD_PDF);
    File pathFile = new File(path);
    if(!pathFile.exists()){
      // 创建多级文件夹
      pathFile.mkdirs();
    }
    //文件存放
    String pdfPath= exportFileService.exportEvaluationPDF(selfEvaluationId,path);
    // 读到流中
    // 文件的存放路径
    InputStream inStream = null;
    // 设置输出的格式
    response.reset();
    response.setContentType("application/pdf");
    response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
    // 循环取出流中的数据
    byte[] b = new byte[100];
    int len =0;
    try {
      inStream =new FileInputStream(pdfPath);
      while ((len = inStream.read(b)) > 0) {
        response.getOutputStream().write(b, 0, len);
      }
      File file =new File(pdfPath);
      // 如果文件存在 删除。
      if(file.exists()){
        file.delete();
      }
      inStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   *  导出Excel
   * @param fileName
   *        -- 导出的文件名称
   * @param request
   * @param response
   * @ @author tannc
   * @create-time 2018-06-22 14:47:24
   */
  @GetMapping("train/excel")
  public void exportExcel(@RequestParam(value = "fileName",required = false) String fileName,
                          @RequestParam(value = "exportType",required = false) String exportType,
                        HttpServletRequest request,
                        HttpServletResponse response) throws IOException {
    // 下载本地文件
    if(StringUtils.isEmpty(fileName)) {
      fileName = "training.xlsx".toString(); // 文件的默认保存名
    }
    // 定义临时存储文件位置
    String path = request.getSession().getServletContext().getRealPath(Constants.UPLOAD_PDF);
    File pathFile = new File(path);
    if(!pathFile.exists()){
      // 创建多级文件夹
      pathFile.mkdirs();
    }
    // 获取登录用户的信息
    LoginUser user = (LoginUser) request.getSession().getAttribute(Constants.USER_LOGIN_);
    //返回解析后的Excel 文件地址
    String pdfPath= exportFileService.exportTrainExcel(user.getCenterId(),user.getId(),path,exportType);
    // 读到流中
    // 文件的存放路径
    InputStream inStream = null;
    // 设置输出的格式
    response.reset();
    // 设置为二进制流格式
    response.setContentType("application/octet-stream");
    response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
    // 循环取出流中的数据
    byte[] b = new byte[100];
    int len =0;
    try {
      inStream =new FileInputStream(pdfPath);
      while ((len = inStream.read(b)) > 0) {
        response.getOutputStream().write(b, 0, len);
      }
      // 删除临时文件
      File file =new File(pdfPath);
      // 如果文件存在 删除。
      if(file.exists()){
        file.delete();
      }
      inStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

    @GetMapping("/excel/summary")
    public void exportSummaryExcel(HttpServletResponse res,@RequestParam("year") Integer year){
        Integer schoolId = 1;
        List<UserSummaryDTO> result = trainingService.getUserSummary(schoolId, year);
        if(result == null || result.size() < 1){
            return;
        }
        for(UserSummaryDTO user : result){
            String userName = user.getName().replace("&", " ");
            user.setName(userName);
        }
        String fileName = "summary.xlsx";
        res.setContentType("application/octet-stream");
        res.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        try{
            OutputStream out = res.getOutputStream();
            ExcelUtil.exportExcel(result, out);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @GetMapping("/excel/summary/user")
    public void exportUserSummaryExcel(HttpServletResponse res,@RequestParam("year") Integer year,@RequestParam("userId")Integer userId){
        //Integer schoolId = 1;
        UserCourseHistoryDTO result = trainingService.getUserCourseHistory(userId,year);
        if(result == null || result.getHistory() == null || result.getHistory().size() < 1){
            return;
        }
        String fileName = result.getName() + "summary_"+year+".xlsx";
        res.setContentType("application/octet-stream");
        res.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        try{
            OutputStream out = res.getOutputStream();
            ExcelUtil.exportExcel(result.getHistory(), out);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @GetMapping("/excel/course/list")
    public void exportCourseListExcel(HttpServletResponse res,@RequestParam("year") Integer year){
        Integer schoolId = 1;
        List<CourseDTO> result = trainingService.getCourseList(year,schoolId, CourseStatusEnum.CONFIRM.getId());
        if(result == null  || result.size() < 1){
            return;
        }
        for(CourseDTO course : result){
            List<OptionDTO> members = course.getMembers();
            if(members == null || members.size() < 1){
                continue;
            }
            for (OptionDTO member : members){
                String name = member.getName();
                member.setName(name.replace("&"," "));
            }
        }
        String fileName = "Course-"+year+".xlsx";
        res.setContentType("application/octet-stream");
        res.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
        try{
            OutputStream out = res.getOutputStream();
            ExcelUtil.exportExcel(result, out, "exportCourseList");
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
