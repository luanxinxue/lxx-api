package com.lxx.service.order;


import com.lxx.common.Response;
import com.lxx.model.common.PageInfo;
import com.lxx.model.order.params.PageListParams;
import com.lxx.model.order.vo.OrderVo;

/**
 *
 * @author luanxinxue
 * @since 2022-12-06
 */

public interface OrderService {

    Boolean testTryLock() throws InterruptedException;

    /**
     * @Description
     * @Author lxx
     * @Date 2023/5/9
     */
    PageInfo<OrderVo> pageList(PageListParams pageListParams);
}
