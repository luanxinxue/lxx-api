package com.lxx.model.order.vo;

import lombok.Data;

import java.util.Date;

@Data
public class OrderVo {
    /**
     * id
     */
    private Integer id;

    /**
     * 订单号
     */
    private String orderNo;


    /**
     * 订单状态（0,：未支付，1：已支付,
     */
    private Integer status;

    /**
     * 支付类型（0：微信支付，1：阿里支付，2：混合支付，3：余额支付）
     */
    private Integer payType;


    /**
     * 订单金额
     */
    private Integer amount;


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

}