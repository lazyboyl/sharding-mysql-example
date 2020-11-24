package com.sharding.mysql.example.dao;


import com.sharding.mysql.example.entity.ShardingOrder;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author linzf
 * @since 2020/11/23
 * 类描述：
 */
public interface ShardingOrderDao extends Mapper<ShardingOrder> {

    /**
     * 功能描述： 查询订单信息
     * @param orderId
     * @return
     */
    List<ShardingOrder> queryShardingOrder(@Param("orderId") Integer orderId);

    /**
     * 功能描述： 插入数据
     *
     * @param shardingOrder
     * @return
     */
    int saveShardingOrder(ShardingOrder shardingOrder);

}
