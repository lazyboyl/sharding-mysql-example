package com.sharding.mysql.example.service;

import com.sharding.mysql.example.dao.ShardingOrderDao;
import com.sharding.mysql.example.dao.ShardingOrderItemDao;
import com.sharding.mysql.example.entity.ShardingOrder;
import com.sharding.mysql.example.entity.ShardingOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author linzf
 * @since 2020/11/23
 * 类描述：
 */
@Service
@Transactional(rollbackFor = {Exception.class})
public class ShardingOrderService {

    @Autowired
    private ShardingOrderDao shardingOrderDao;

    @Autowired
    private ShardingOrderItemDao shardingOrderItemDao;

    /**
     * 功能没考上： 插入订单数据
     * @param shardingOrder
     */
    public void saveShardingOrder(ShardingOrder shardingOrder){
        shardingOrderDao.saveShardingOrder(shardingOrder);
        for(ShardingOrderItem shardingOrderItem:shardingOrder.getShardingOrderItemList()){
            shardingOrderItemDao.insertSelective(shardingOrderItem);
        }
    }

    /**
     * 功能描述： 查询订单数据
     * @param orderId
     * @return
     */
    public List<ShardingOrder> queryShardingOrder(Integer orderId){
        return shardingOrderDao.queryShardingOrder(orderId);
    }

}
