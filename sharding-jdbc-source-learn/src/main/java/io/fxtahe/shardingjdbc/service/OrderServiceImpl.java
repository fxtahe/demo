package io.fxtahe.shardingjdbc.service;

import io.fxtahe.shardingjdbc.domain.OrderDomain;
import io.fxtahe.shardingjdbc.mapper.OrderMapper;
import io.fxtahe.shardingjdbc.service.inter.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p></p>
 * @author fxtahe
 * @since 2021/2/19
 */
@Service
public class OrderServiceImpl implements IOrderService {


    @Resource
    private OrderMapper orderMapper;


    @Override
    public OrderDomain queryOrderById(OrderDomain domain) {
        return orderMapper.queryOrderById(domain.getOrderId(), domain.getProductId());
    }

    @Override
    public List<OrderDomain> queryOrderInfos() {
        return orderMapper.queryOrderInfos();
    }

    @Override
    public void saveOrderInfo(OrderDomain domain) {
        orderMapper.saveOrder(domain);
    }
}
