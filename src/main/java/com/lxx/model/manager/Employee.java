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
@TableName("m_employee")
@Data
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private Long id;

	/**
	 * 部门id
	 */

	private Long departmentId;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 性别
	 */
	private Integer sex;

	/**
	 * 联系电话
	 */
	private String mobile;

	/**
	 * 
	 */

	private Date createTime;

	/**
	 * 
	 */
	private Date updateTime;




}
