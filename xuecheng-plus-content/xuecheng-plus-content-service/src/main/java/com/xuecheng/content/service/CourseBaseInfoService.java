package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.EditCourseDto;
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

     /**
      * @description 添加课程基本信息
      * @param companyId  教学机构id
      * @param addCourseDto  课程基本信息
      * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
      * @author Mr.M
      * @date 2022/9/7 17:51
      */
     CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);

     /**
      * @description 根据id查询课程基本信息
      * @param courseId  课程id
      * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
      * @author Mr.M
      * @date 2022/10/9 8:13
      */
     CourseBaseInfoDto getCourseBaseInfo(long courseId);

     /**
      * @description 修改课程信息
      * @param companyId  机构id
      * @param dto  课程信息
      * @return com.xuecheng.content.model.dto.CourseBaseInfoDto
      * @author Mr.M
      * @date 2022/9/8 21:04
      */
     CourseBaseInfoDto updateCourseBase(Long companyId, EditCourseDto dto);
}
