package com.xuecheng.content.api.controller;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.service.CourseCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author itcast
 */
@Slf4j
@RestController
@Api(value = "课程分类相关接口",tags = "课程分类相关接口")
public class CourseCategoryController {
    @Autowired
    CourseCategoryService courseCategoryService;
    /**
     * @description:

     * @return: java.util.List<com.xuecheng.content.model.dto.CourseCategoryTreeDto>
     * @author: Jie
     * @date: 2023/3/6 14:27
     */

    @ApiOperation("课程相关查询接口")
    @GetMapping("/course-category/tree-nodes")
    public List<CourseCategoryTreeDto> queryTreeNodes() {
        return courseCategoryService.queryTreeNodes("1");
    }
}
