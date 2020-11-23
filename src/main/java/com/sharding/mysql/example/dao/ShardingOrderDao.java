package com.sharding.mysql.example.dao;


import com.sharding.mysql.example.entity.ShardingOrder;

/**
 * @author linzf
 * @since 2020/11/23
 * 类描述：
 */
public interface ShardingOrderDao {

    /**
     * 功能描述： 插入数据
     *
     * @param shardingOrder
     * @return
     */
    int saveShardingOrder(ShardingOrder shardingOrder);

}
