package com.sharding.mysql.example.entity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

/**
 * @author linzf
 * @since 2020/11/23
 * 类描述：
 */
@Table(name = "t_order")
public class ShardingOrder {

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "user_id")
    private Integer userId;

    @Transient
    List<ShardingOrderItem> shardingOrderItemList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<ShardingOrderItem> getShardingOrderItemList() {
        return shardingOrderItemList;
    }

    public void setShardingOrderItemList(List<ShardingOrderItem> shardingOrderItemList) {
        this.shardingOrderItemList = shardingOrderItemList;
    }

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
