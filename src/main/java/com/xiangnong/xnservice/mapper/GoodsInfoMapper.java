package com.xiangnong.xnservice.mapper;

import com.xiangnong.xnservice.entity.GoodsInfo;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(GoodsInfo record);

    int insertSelective(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);
}