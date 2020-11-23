package com.sharding.mysql.example.entity;

import java.util.Date;

/**
 * @author linzf
 * @since 2020/11/23
 * 类描述：
 */
public class ShardingOrder {

    private Integer orderId;

    private String orderNo;

    private Date createTime;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
