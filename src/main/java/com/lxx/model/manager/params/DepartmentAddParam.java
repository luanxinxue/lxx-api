package com.lxx.model.manager.params;

import com.lxx.common.page.PageParam;
import lombok.Data;

import java.util.Date;

@Data
public class DepartmentAddParam {


    private Long id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门负责人id
     */

    private Long leaderId;

    /**
     * 父级id
     */
    private Long parentId;

    /**
     *
     */
    private String path;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;

    private String departmentNo;


}
