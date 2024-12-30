package com.lxx.mapper;

import com.lxx.model.order.OrderMain;
import com.lxx.model.order.params.PageListParams;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author luanxinxue
 * @since 2022-12-02
 */
@Mapper
@Component
public interface OrderMapper {

    List<OrderMain> pageList(PageListParams pageListParams);

    Integer count (PageListParams pageListParams);

}