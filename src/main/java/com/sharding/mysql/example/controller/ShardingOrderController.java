package com.sharding.mysql.example.controller;

import com.sharding.mysql.example.entity.ShardingOrder;
import com.sharding.mysql.example.service.ShardingOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author linzf
 * @since 2020/11/23
 * 类描述：
 */
@RestController
public class ShardingOrderController {

    @Autowired
    private ShardingOrderService shardingOrderService;


    /**
     * 功能没考上： 插入订单数据
     * @param shardingOrder
     */
    @PostMapping("saveShardingOrder")
    public void saveShardingOrder(@RequestBody ShardingOrder shardingOrder){
        shardingOrderService.saveShardingOrder(shardingOrder);
    }
}
