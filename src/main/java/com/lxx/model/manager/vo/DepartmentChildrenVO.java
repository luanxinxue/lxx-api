package com.lxx.model.manager.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author luanxinxue
 * @since 2024-11-14
 */
@Data
public class DepartmentChildrenVO implements Serializable {


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
