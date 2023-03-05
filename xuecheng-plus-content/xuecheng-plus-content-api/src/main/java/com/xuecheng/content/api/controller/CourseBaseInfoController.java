package com.xuecheng.content.api.controller;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 课程信息编辑接口
 * @author Mr.M
 * @date 2022/9/6 11:29
 * @version 1.0
 */
@Api(value = "课程管理接口",tags = "课程管理接口")
@RestController
public class CourseBaseInfoController {

    @Autowired
    CourseBaseInfoService courseBaseInfoService;

    @ApiOperation("课程查询接口")
    @PostMapping("/course/list")
    /**
     * @description:
     * @Param pageParams:
     * @Param queryCourseParams:
     * @return: com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
     * @author: Jie
     * @date: 2023/3/5 10:59
     */

    public PageResult<CourseBase> list(PageParams pageParams, @RequestBody QueryCourseParamsDto queryCourseParams){

//        CourseBase courseBase = new CourseBase();
//        courseBase.setName("测试名称");
//        courseBase.setCreateDate(LocalDateTime.now());
//        List<CourseBase> courseBases = new ArrayList();
//        courseBases.add(courseBase);
//        PageResult pageResult = new PageResult<CourseBase>(courseBases,10,1,10);
        //调用service获取数据
        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParams);

        return courseBasePageResult;

    }

}