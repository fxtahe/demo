package io.fxtahe.shardingjdbc.mapper;

import io.fxtahe.shardingjdbc.domain.OrderDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {


    List<OrderDomain> queryOrderInfos();

    OrderDomain queryOrderById(@Param("orderId") long orderId, @Param("productId") String productId);

    int saveOrder(OrderDomain orderDomain);
}
