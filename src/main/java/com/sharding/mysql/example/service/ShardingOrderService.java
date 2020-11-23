package com.sharding.mysql.example.service;

import com.sharding.mysql.example.dao.ShardingOrderDao;
import com.sharding.mysql.example.entity.ShardingOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    /**
     * 功能没考上： 插入订单数据
     * @param shardingOrder
     */
    public void saveShardingOrder(ShardingOrder shardingOrder){
        shardingOrderDao.saveShardingOrder(shardingOrder);
    }

}
