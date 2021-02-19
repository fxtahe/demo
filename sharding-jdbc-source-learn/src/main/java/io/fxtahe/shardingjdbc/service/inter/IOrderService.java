package io.fxtahe.shardingjdbc.service.inter;


import io.fxtahe.shardingjdbc.domain.OrderDomain;

import java.util.List;


public interface IOrderService {


    OrderDomain queryOrderById(OrderDomain inDTO);

    List<OrderDomain> queryOrderInfos();

    void saveOrderInfo(OrderDomain inDTO);
}
