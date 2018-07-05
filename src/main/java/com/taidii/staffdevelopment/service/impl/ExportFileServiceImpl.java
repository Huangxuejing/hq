package com.taidii.staffdevelopment.service.impl;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.taidii.staffdevelopment.constans.Constants;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationDetailDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationEventDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationPlanDTO;
import com.taidii.staffdevelopment.dto.selfEvaluation.SelfEvaluationSkillDTO;
import com.taidii.staffdevelopment.service.IExportFileService;
import com.taidii.staffdevelopment.service.ISelfEvaluationService;
import com.taidii.staffdevelopment.util.ExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.service.impl
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/22 15:22
 */
@Service
public class ExportFileServiceImpl implements IExportFileService {

  private static  final Logger logger = LoggerFactory.getLogger(ExportFileServiceImpl.class);

  @Autowired
  private ISelfEvaluationService selfEvaluationService ;
  /**
   * @param selfEvaluationId
   *     -- 评估id
   *
   * @description: 导出老师的评估表
   * @author:谭农春
   * @createTime: 2018/6/22 15:21
   */
  @Override
  public String exportEvaluationPDF(Integer selfEvaluationId, String path)  {
    // 全局id
    String uuid = UUID.randomUUID().toString();
    String filePath =path.concat(File.separator).concat(uuid).concat(".pdf");
    try {
      // 第一步，实例化一个document对象
      Document document = new Document();
      File file = new File(filePath);
      file.createNewFile();
      // 第二步，设置要到出的路径
      FileOutputStream out = new FileOutputStream(filePath);
      //如果是浏览器通过request请求需要在浏览器中输出则使用下面方式
      //OutputStream out = response.getOutputStream();
      SelfEvaluationDetailDTO dto = selfEvaluationService.getSelfEvaluationDetail(selfEvaluationId);
      // 第三步,设置字符
      BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", false);
      Font fontZH = new Font(bfChinese, 12.0F, 0);
      // 第四步，将pdf文件输出到磁盘
      PdfWriter writer = PdfWriter.getInstance(document, out);
      // 设置页码
      applyFooter(writer);
      // 第五步，打开生成的pdf文件
      document.open();
      // 第六步,设置内容
      pdfHome(document, dto,bfChinese);
      // 换行
      document.newPage();
     // 导出checkList
      checklist(document,dto,bfChinese);
      // 导出checkList
      strengthAndAchievements(document,dto,bfChinese);
      // 提升计划
      improvementPlan(document,dto,bfChinese);
      // 校长的评论
      appraiserComment(document,dto,bfChinese);
      // 第七步，关闭document
      document.close();
    }catch ( Exception e){
      e.printStackTrace();
    }
    return filePath;
  }

  /**
   * 通用导出模板
   *
   * @param centerId
   * @param id
   * @param exportType
   *
   * @return
   */
  @Override
  public String exportTrainExcel(Integer centerId, Integer id, String path,String exportType)  {
    // 全局id
    String uuid = UUID.randomUUID().toString();
    // 数据区域
    String[] cellTitle = {"姓名","学号","性别","入学日期"};
    //需要导出的数据 ==========================》
    List<String[]> dataList = new ArrayList<String[]>();
    dataList.add(new String[]{"东邪","17232401001","男","2015年9月"});
    dataList.add(new String[]{"西毒","17232401002","女","2016年9月"});
    dataList.add(new String[]{"南帝","17232401003","男","2017年9月"});
    dataList.add(new String[]{"北丐","17232401004","男","2015年9月"});
    dataList.add(new String[]{"中神通","17232401005","女","2017年9月"});
    // 数据区域 ==========================》
    String filePath =path.concat(File.separator).concat(uuid).concat(".xlsx");

    //输出
    File  file = new File(filePath);
    // 构造Excel 数据
    XSSFWorkbook workbook = ExcelUtil.getWorkbook(cellTitle,dataList);
    FileOutputStream outStream =null;
    try {
      //将文件写到磁盘
      outStream = new FileOutputStream(file);
      workbook.write(outStream);
      outStream.flush();
    }catch ( IOException e ){
      logger.info(e.getMessage());
      e.printStackTrace();
    }
    finally {
      if(null!= outStream){
        try {
          outStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return filePath;
  }


  /**
   *  导出 check list
   * @param document
   * @param dto
   *       导出的对象
   * @param bfChinese
   */
  private void checklist(Document document, SelfEvaluationDetailDTO dto, BaseFont bfChinese) throws DocumentException {
    Font firstfont = new Font(bfChinese, 18, 0);
    Font secondfont = new Font(bfChinese, 14, 0);
    Font thirdfont = new Font(bfChinese, 12, 0);
    Paragraph titleParagraph =null;
    PdfPTable table =null;
    Paragraph tempParagraph =null;
    PdfPCell baseTableCell =null;
    String suminfo = "Total score ：%s Average score：%s" ;
    if(!CollectionUtils.isEmpty(dto.getSkillList())){
      for(SelfEvaluationSkillDTO skillDto : dto.getSkillList()){
        if(CollectionUtils.isEmpty(skillDto.getChild()) ){
          continue;
        }
        // 一级设置成标题
         String title =skillDto.getName();
         titleParagraph = new Paragraph(new Chunk(title, firstfont).setLocalDestination(title));
        document.add(titleParagraph);
        // 换行
        document.add(new Paragraph("\n"));
        table = new PdfPTable(4);
        table.setWidthPercentage(100.0F);
        table.setHeaderRows(1);
        table.getDefaultCell().setHorizontalAlignment(1);
        if(!CollectionUtils.isEmpty(skillDto.getChild())){
          int count = 0;
          int preCount =0 ;
          //全局计数器
          int globalCount =0;
          int len = skillDto.getChild().size();
          // 第二层
          for(SelfEvaluationSkillDTO secondDto : skillDto.getChild()){
            int sum = 0;
            float avg = 0.0f;
            int childCount =0;
            globalCount ++;
            if(secondDto.getDepth().equals(2)) {
              sum =0 ;
              avg=0.0f;
              childCount =0;
              // 设置表头
              baseTableCell = new PdfPCell(new Paragraph(secondDto.getName(), secondfont));
              baseTableCell.setBackgroundColor(new BaseColor(236, 236, 236));
              table.addCell(baseTableCell);
              baseTableCell = new PdfPCell(new Paragraph("Guiding Questions", secondfont));
              baseTableCell.setBackgroundColor(new BaseColor(236, 236, 236));
              table.addCell(baseTableCell);
              baseTableCell = new PdfPCell(new Paragraph("Evidence（s）", secondfont));
              baseTableCell.setBackgroundColor(new BaseColor(236, 236, 236));
              table.addCell(baseTableCell);
              baseTableCell = new PdfPCell(new Paragraph("Rating", secondfont));
              baseTableCell.setBackgroundColor(new BaseColor(236, 236, 236));
              table.addCell(baseTableCell);
              // 计数器
              count = count +1;
            }
             if(secondDto.getDepth().equals(3)) {
                //  skill 名称
                  baseTableCell = new PdfPCell(new Paragraph(secondDto.getName(), thirdfont));
                  baseTableCell.setVerticalAlignment(Element.ALIGN_LEFT);
                  table.addCell(baseTableCell);
               // guidingQuestion
                 baseTableCell = new PdfPCell(new Paragraph(secondDto.getGuidingQuestion()==null?"":secondDto.getGuidingQuestion(), thirdfont));
                 baseTableCell.setVerticalAlignment(Element.ALIGN_LEFT);
                 table.addCell(baseTableCell);
                 // evidence
                 baseTableCell = new PdfPCell(new Paragraph(secondDto.getEvidence()==null?"":secondDto.getEvidence(), thirdfont));
                 baseTableCell.setVerticalAlignment(Element.ALIGN_LEFT);
                 table.addCell(baseTableCell);
                  // 分数
                  table.addCell(new Paragraph(String.valueOf(secondDto.getRaing()), thirdfont));
                  sum = sum + secondDto.getRaing();
                  childCount = childCount+1;
              }
              boolean isRight =(globalCount<len && skillDto.getChild().get(globalCount).getDepth()==2) || globalCount==skillDto.getChild().size();
             //如果当前是2 下一个页面
             if(isRight){
                 // 平均分
                 avg = sum / (childCount==0?1:childCount);
                 BigDecimal b = new BigDecimal(avg);
                 float f1 = b.setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();
                 avg = f1;
                 // 汇总信息
                 tempParagraph = new Paragraph(String.format(suminfo, sum, avg), thirdfont);
                 // 居右
                 baseTableCell = new PdfPCell(tempParagraph);
                 tempParagraph.setAlignment(Element.ALIGN_RIGHT);
                 baseTableCell.setColspan(4);
                 baseTableCell.setPaddingRight(15.0f);
                 baseTableCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                 baseTableCell.setBackgroundColor(new BaseColor(100, 100, 100));
                 table.addCell(baseTableCell);
             }

          }
        }
        //第一层就一张表
        document.add(table);
        document.add(new Paragraph("\n"));
      }
    }
    // 换页
    document.newPage();
  }

  /**
   *  导出强项和优势
   * @param document
   * @param dto
   * @param bfChinese
   */
  private void strengthAndAchievements(Document document, SelfEvaluationDetailDTO dto, BaseFont bfChinese) throws DocumentException {
    Font strengthfont = new Font(bfChinese, 18, 0);
    Font headerfont = new Font(bfChinese, 14, 0);
    Font contentfont = new Font(bfChinese, 12, 0);
    Paragraph titleParagraph =null;
    String title ="Strength and Achievements";
    titleParagraph = new Paragraph(new Chunk(title, strengthfont).setLocalDestination(title));
    PdfPTable table =null;
    document.add(titleParagraph);
    document.add(new Paragraph("\n"));
    Paragraph  tempParagraph =null;
    PdfPCell pdfCell =null;
    // 添加表格
    table = new PdfPTable(4);
    table.setWidthPercentage(100.0F);
    table.setHeaderRows(1);
    table.getDefaultCell().setHorizontalAlignment(1);
    // 添加表头
    pdfCell =new PdfPCell(new Paragraph("S/N", headerfont));
    pdfCell.setBackgroundColor(new BaseColor(236,236,236));
    table.addCell(pdfCell);
    pdfCell =new PdfPCell(new Paragraph("Strengths and Achievements", headerfont));
    pdfCell.setBackgroundColor(new BaseColor(236,236,236));
    table.addCell(pdfCell);
    pdfCell =new PdfPCell(new Paragraph("Evidence", headerfont));
    pdfCell.setBackgroundColor(new BaseColor(236,236,236));
    table.addCell(pdfCell);
    pdfCell =new PdfPCell(new Paragraph("Period/Date", headerfont));
    pdfCell.setBackgroundColor(new BaseColor(236,236,236));
    table.addCell(pdfCell);
    //遍历强项
    if(!CollectionUtils.isEmpty(dto.getReflection())){
      int count = 1;
      for(SelfEvaluationEventDTO eventDto : dto.getReflection()){
        tempParagraph =new Paragraph(String.valueOf(count), contentfont);
        tempParagraph.setAlignment(Element.ALIGN_LEFT);
        table.addCell(tempParagraph);
        // 优势
        pdfCell =new PdfPCell(new Paragraph(eventDto.getStrengthsOrAchievements(), contentfont));
        pdfCell.setVerticalAlignment(Element.ALIGN_LEFT);
        table.addCell(pdfCell);
        pdfCell =new PdfPCell(new Paragraph(eventDto.getEvidence(), contentfont));
        pdfCell.setVerticalAlignment(Element.ALIGN_LEFT);
        table.addCell(pdfCell);
        table.addCell(new Paragraph(eventDto.getDate(), contentfont));
        //遍历强项
         count ++;
      }
    }
    //第一层就一张表
    document.add(table);
    document.add(new Paragraph("\n"));
    // 换页
    document.newPage();
  }

  /**
   *  提升计划
   * @param document
   * @param dto
   * @param bfChinese
   */
  private void improvementPlan(Document document, SelfEvaluationDetailDTO dto, BaseFont bfChinese) throws DocumentException {
    Font planfont = new Font(bfChinese, 18, 0);
    Font headerfont = new Font(bfChinese, 14, 0);
    Font contentfont = new Font(bfChinese, 12, 0);
    Paragraph titleParagraph =null;
    String title ="Improvement Plan";
    titleParagraph = new Paragraph(new Chunk(title, planfont).setLocalDestination(title));
    PdfPTable table =null;
    PdfPCell pdfCell = null;
    document.add(titleParagraph);
    document.add(new Paragraph("\n"));
    // 添加表格
    table = new PdfPTable(4);
    table.setWidthPercentage(100.0F);
    table.setHeaderRows(1);
    table.getDefaultCell().setHorizontalAlignment(1);
    //遍历强项
    if(!CollectionUtils.isEmpty(dto.getReflection())){
      int count = 0;
      for(SelfEvaluationPlanDTO planDTO : dto.getPlanList()){
        // 设置头部
        if(planDTO.getDepth().equals(2)){
          pdfCell = new PdfPCell(new Paragraph(planDTO.getName(), headerfont));
          pdfCell.setBackgroundColor(new BaseColor(236,236,236));
          table.addCell(pdfCell);
           if(count == 0){
             pdfCell = new PdfPCell(new Paragraph("Area of Improvement", headerfont));
             pdfCell.setBackgroundColor(new BaseColor(236,236,236));
             table.addCell(pdfCell);

             pdfCell = new PdfPCell(new Paragraph("Action Plan", headerfont));
             pdfCell.setBackgroundColor(new BaseColor(236,236,236));
             table.addCell(pdfCell);
             pdfCell = new PdfPCell(new Paragraph("Target Date of Completion", headerfont));
             pdfCell.setBackgroundColor(new BaseColor(236,236,236));
             table.addCell(pdfCell);
           }
           else{
             pdfCell =new PdfPCell(new Paragraph("", headerfont));
             pdfCell.setBackgroundColor(new BaseColor(236,236,236));
             table.addCell(pdfCell);
             table.addCell(pdfCell);
             table.addCell(pdfCell);
           }
        }
        else if(planDTO.getDepth().equals(3)){
          pdfCell =new PdfPCell(new Paragraph(planDTO.getName(), contentfont));
          pdfCell.setVerticalAlignment(Element.ALIGN_LEFT);
          table.addCell(pdfCell);
          // 改善领域
          pdfCell =new PdfPCell(new Paragraph(planDTO.getAreaOfImprovement(), contentfont));
          pdfCell.setVerticalAlignment(Element.ALIGN_LEFT);
          table.addCell(pdfCell);
          pdfCell =new PdfPCell(new Paragraph(planDTO.getActionPlan(), contentfont));
          pdfCell.setVerticalAlignment(Element.ALIGN_LEFT);
          table.addCell(pdfCell);
          table.addCell(new Paragraph(planDTO.getTargetCompleteDate(), contentfont));
        }
        //遍历强项
        count ++;
      }
    }
    //第一层就一张表
    document.add(table);
    document.add(new Paragraph("\n"));
    // 换页
    document.newPage();
  }

  /**
   *  校长评论
   * @param document
   * @param dto
   * @param bfChinese
   */
  private void appraiserComment(Document document, SelfEvaluationDetailDTO dto, BaseFont bfChinese) throws DocumentException {
    Font planfont = new Font(bfChinese, 18, 0);
    Font contentFont = new Font(bfChinese, 14, 0);
    Paragraph titleParagraph =null;
    String title ="Appraiser's Comment";
    titleParagraph = new Paragraph(new Chunk(title, planfont).setLocalDestination(title));
    document.add(titleParagraph);
    if(null!=dto && null!= dto.getEvaluatorComment()){
      Paragraph  contentParagraph = new Paragraph(new Chunk(dto.getEvaluatorComment(), contentFont));
      document.add(contentParagraph);
    }
  }


  /**
   *  设置页眉、页脚
   * @param writer
   */
  private void applyFooter(PdfWriter writer) {
    writer.setPageEvent(new PdfPageEventHelper() {
      @Override
      public void onEndPage(PdfWriter writer, Document document) {

        PdfContentByte cb = writer.getDirectContent();
        cb.saveState();

        cb.beginText();
        BaseFont bf = null;
        try {
          bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.EMBEDDED);
        } catch (Exception e) {
          e.printStackTrace();
        }
        cb.setFontAndSize(bf, 10);

        //Header
        float x = document.top(-20);

//        //左
//        cb.showTextAligned(PdfContentByte.ALIGN_LEFT,
//            "H-Left",
//            document.left(), x, 0);
//        //中
//        cb.showTextAligned(PdfContentByte.ALIGN_CENTER,
//            writer.getPageNumber()+ " page",
//            (document.right() + document.left())/2,
//            x, 0);
//        //右
//        cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,
//            "H-Right",
//            document.right(), x, 0);

        //Footer
        float y = document.bottom(-20);

//        //左
//        cb.showTextAligned(PdfContentByte.ALIGN_LEFT,
//            "F-Left",
//            document.left(), y, 0);
        //中
        cb.showTextAligned(PdfContentByte.ALIGN_CENTER,
            writer.getPageNumber()+"",
            (document.right() + document.left())/2,
            y, 0);
        //右
//        cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,
        //            "F-Right",
        //            document.right(), y, 0);

        cb.endText();

        cb.restoreState();
      }
    });
  }

  /**
   *  设置主页
   * @param document
   * @param dto
   * @param bfChinese
   * @throws DocumentException
   */
  private void pdfHome(Document document, SelfEvaluationDetailDTO dto, BaseFont bfChinese) throws DocumentException {
    Font titlefont = new Font(bfChinese, 28F, 0);
    String title =dto.getPeriod()+ Constants.PRE_TITLE;
    Paragraph titleParagraph = new Paragraph(new Chunk(title, titlefont).setLocalDestination(title));
    //文本居中
    titleParagraph.setAlignment(Paragraph.ALIGN_CENTER);
    document.add(new Paragraph("\n\n"));
    document.add(new Paragraph("\n\n"));
    document.add(new Paragraph("\n\n"));
    document.add(new Paragraph("\n\n"));
    document.add(titleParagraph);
    document.add(new Paragraph("\n\n"));

    String teacherName = Constants.PRE_NAME +dto.getUserName();
    Font namefont = new Font(bfChinese, 14F, 0);
    Paragraph nameParagraph = new Paragraph(new Chunk(teacherName, namefont).setLocalDestination(teacherName));
    //文本居中
    nameParagraph.setAlignment(Paragraph.ALIGN_CENTER);
    document.add(nameParagraph);
    document.add(new Paragraph("\n"));

    String level =Constants.PRE_LEVEL+ dto.getDutyLevelName();
    Font levelfont = new Font(bfChinese, 14.0F, 0);
    // setLocalDestination 设置目录
    Paragraph levelParagraph = new Paragraph(new Chunk(level, levelfont).setLocalDestination(level));
    //文本居中
    levelParagraph.setAlignment(Paragraph.ALIGN_CENTER);
    document.add(levelParagraph);
    document.add(new Paragraph("\n"));

    String time =Constants.PRE_LASTAPPRAISAL  + dto.getLastUpdate();
    Font timefont = new Font(bfChinese, 14.0F, 0);
    // setLocalDestination 设置目录
    Paragraph timeParagraph = new Paragraph(new Chunk(time, levelfont).setLocalDestination(level));
    //文本居中
    timeParagraph.setAlignment(Paragraph.ALIGN_CENTER);
    document.add(timeParagraph);
    document.add(new Paragraph("\n"));
  }
}
