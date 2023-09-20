package com.itheima.take_out.dto;


import com.itheima.take_out.entity.OrderDetail;
import com.itheima.take_out.entity.Orders;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto extends Orders {

    //记录订单的数量
    private Integer sumNum;

    //记录下单用户的名字
    private String consignee;

    //记录订单中具体的菜品
    private List<OrderDetail> orderDetails;
}
