package io.fxtahe.shardingjdbc.domain;

import lombok.Data;

@Data
public class OrderDomain {

    private Long orderId;

    private String productId;

    private int num;
}
