package com.gulimarket.member.dao;

import com.gulimarket.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xmc
 * @email xmc1202@gmail.com
 * @date 2022-03-05 08:12:35
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
