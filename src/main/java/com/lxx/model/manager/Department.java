package com.lxx.model.manager;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author luanxinxue
 * @since 2024-12-25
 */
@TableName("m_department")
@Data
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
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





}
