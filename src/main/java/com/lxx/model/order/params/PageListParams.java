package com.lxx.model.order.params;

import com.lxx.common.page.PageParam;
import lombok.Data;

@Data
public class PageListParams extends PageParam {


    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 操作人姓名
     */
    private String operatorName;

    /**
     * 订单状态（0,：未支付，1：已支付,
     */
    private Integer status;


}