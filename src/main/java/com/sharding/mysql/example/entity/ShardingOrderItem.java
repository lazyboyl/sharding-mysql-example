package com.sharding.mysql.example.entity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author linzf
 * @since 2020/11/24
 * 类描述：
 */
@Table(name = "t_order_item")
public class ShardingOrderItem {

    /**
     * 订单明细ID
     */
    @Column(name = "order_item_id")
    private Integer orderItemId;

    /**
     * 订单流水ID
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单明细编号
     */
    @Column(name = "order_item_no")
    private String orderItemNo;


    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemNo() {
        return orderItemNo;
    }

    public void setOrderItemNo(String orderItemNo) {
        this.orderItemNo = orderItemNo;
    }
}
