package com.gulimarket.coupon.dao;

import com.gulimarket.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-05 08:00:12
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
