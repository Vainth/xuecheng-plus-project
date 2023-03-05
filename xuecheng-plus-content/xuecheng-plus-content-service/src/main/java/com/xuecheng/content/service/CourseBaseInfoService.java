package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.stereotype.Service;

/**
 * @Description 课程基本信息管理业务接口
 * @Author Jie
 * @Date 2023/3/5 9:22
 * @Version 1.0
 */
public interface CourseBaseInfoService {
     /**
      * @description: 课程查询接口
      * @Param pageParams: 分页参数
      * @Param queryCourseParamsDto: 查询条件
      * @return: com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
      * @author: Jie
      * @date: 2023/3/5 10:03
      */
     
     PageResult<CourseBase> queryCourseBaseList(PageParams pageParams , QueryCourseParamsDto queryCourseParamsDto);
}
