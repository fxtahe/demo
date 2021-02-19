package io.fxtahe.shardingjdbc.controller;

import io.fxtahe.shardingjdbc.domain.OrderDomain;
import io.fxtahe.shardingjdbc.service.inter.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p></p>
 * @author fxtahe
 * @since 2021/2/19
 */
@RestController
public class OrderController {

    @Resource
    private IOrderService orderService;


    @PostMapping("/queryOrderById")
    public OrderDomain queryOrderById(@RequestBody OrderDomain domain) {

        return orderService.queryOrderById(domain);

    }

    @GetMapping("/queryOrderList")
    public List<OrderDomain> queryOrderInfos() {
        return orderService.queryOrderInfos();

    }

    @PostMapping("/saveOrder")
    public void saveOrderInfo(@RequestBody OrderDomain domain) {
        orderService.saveOrderInfo(domain);
    }
}
