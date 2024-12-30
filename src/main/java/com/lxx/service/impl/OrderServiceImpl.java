package com.lxx.service.impl;

import com.lxx.mapper.OrderMapper;
import com.lxx.common.page.PageInfo;
import com.lxx.model.order.OrderMain;
import com.lxx.model.order.params.PageListParams;
import com.lxx.model.order.vo.OrderVo;
import com.lxx.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * 产品标签表  服务实现类
 ** @author luanxinxue
 * @since 2021-04-14
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    RedissonClient redissonClient;

    @Resource
    OrderMapper orderMapper;

    @Override
    public Boolean testTryLock() throws InterruptedException {
        RLock rLock = redissonClient.getLock("111");
        rLock.tryLock(300,SECONDS);
        return true;
    }

    @Override
    public PageInfo<OrderVo> pageList(PageListParams pageListParams) {
        PageInfo<OrderVo> pageInfo = new PageInfo<OrderVo>();

        List<OrderMain> orderMainList = orderMapper.pageList(pageListParams);
        List<OrderVo> orderVoList = orderMainList.stream().map(orderMain -> {
            OrderVo orderVo = new OrderVo();
            BeanUtils.copyProperties(orderMain, orderVo);
            return orderVo;
        }).collect(Collectors.toList());
        Integer count = orderMapper.count(pageListParams);
        pageInfo.setTotal(count);
        pageInfo.setData(orderVoList);
        return pageInfo;
    }
}

