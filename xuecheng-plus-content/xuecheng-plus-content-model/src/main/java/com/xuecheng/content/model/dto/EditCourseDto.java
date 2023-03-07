package com.xuecheng.content.model.dto;

import lombok.Data;

/**
 * @Description 修改课程信息中间类
 * @Author Jie
 * @Date 2023/3/7 9:23
 * @Version 1.0
 */
@Data
public class EditCourseDto extends AddCourseDto{
    //课程id
    private Long id;
}
