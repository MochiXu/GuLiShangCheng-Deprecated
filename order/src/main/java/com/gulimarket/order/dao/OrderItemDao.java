package com.gulimarket.order.dao;

import com.gulimarket.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-05 08:16:14
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
