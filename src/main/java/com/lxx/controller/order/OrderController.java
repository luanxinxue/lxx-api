package com.lxx.controller.order;

import com.lxx.common.response.Response;
import com.lxx.common.response.ResponseUtil;
import com.lxx.exception.ErrorCodeException;
import com.lxx.common.page.PageInfo;
import com.lxx.model.order.params.PageListParams;
import com.lxx.model.order.vo.OrderVo;
import com.lxx.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @Description
 * @Author lxx
 * @Date 2023/5/9
 */
@RestController
@RequestMapping("api/order")
public class OrderController {
    @Resource
    OrderService OrderServiceImpl;

    @RequestMapping("t1")
    public String testFrist() throws ErrorCodeException {
        HashMap<String,Object> map =new HashMap<>();
        map.put("1","我能行");
        map.put("2","顺其自然我会处理好的");
        map.put("3","成功");
        map.put("4","666666666");
//        try {
//            OrderServiceImpl.testTryLock();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        throw new RuntimeException();
//        return JSON.toJSONString(map);
    }
    
    /**
     * @Description
     * @Author lxx
     * @Date 2023/5/9
     */
    @RequestMapping("page-list")
    public Response<PageInfo<OrderVo>> pageList(PageListParams pageListParams){
        return ResponseUtil.makeSuccess(OrderServiceImpl.pageList(pageListParams));
    }


}
