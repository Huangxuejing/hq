package com.taidii.staffdevelopment.service;

import java.io.IOException;

/**
 * @version 1.0
 * @description:
 * @projectName: com.taidii.staffdevelopment.controller
 * @className: staff-development
 * @author:谭农春
 * @createTime:2018/6/22 15:21
 */
public interface IExportFileService {
  /**
   * @description:  
   *      导出老师的评估表
   * @param selfEvaluationId
             -- 评估id
   * @param path
   *        -- 文件相对路径
   * @author:谭农春
   * @createTime: 2018/6/22 15:21 
   */
  
  String exportEvaluationPDF(Integer selfEvaluationId, String path) ;

  /**
   *  通用导出模板
   * @param centerId
   * @param id
   * @param exportType
   *        -- 导出类型区分不同Excel
   * @return
   */
  String exportTrainExcel(Integer centerId, Integer id,String path, String exportType) throws IOException;
}
