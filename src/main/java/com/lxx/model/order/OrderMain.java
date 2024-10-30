package com.lxx.model.order;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 订单主表
 * </p>
 *
 * @author luanxinxue
 * @since 2023-03-02
 */
@Data
public class OrderMain implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private Integer id;

	/**
	 * 订单号
	 */
	private String orderNo;

	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 订单状态（0,：未支付，1：已支付,
	 */
	private Integer status;

	/**
	 * 支付类型（0：微信支付，1：阿里支付，2：混合支付，3：余额支付）
	 */
	private Integer payType;

	/**
	 * 请求来源（0：andorid，1：iOS，2：H5）
	 */
	private String requestType;

	/**
	 * 订单金额
	 */
	private Integer amount;

	/**
	 * 订单类型
	 */
	private String type;

	/**
	 * 操作人id
	 */
	private Integer operatorId;

	/**
	 * 操作人姓名
	 */
	private String operatorName;

	/**
	 * 
	 */
	private Date createTime;

	/**
	 * 
	 */
	private Date updateTime;

	/**
	 * 逻辑删除
	 */
	private Integer isDelete;

}
