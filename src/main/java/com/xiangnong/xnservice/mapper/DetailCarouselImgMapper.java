package com.xiangnong.xnservice.mapper;

import com.xiangnong.xnservice.entity.DetailCarouselImg;

public interface DetailCarouselImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DetailCarouselImg record);

    int insertSelective(DetailCarouselImg record);

    DetailCarouselImg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DetailCarouselImg record);

    int updateByPrimaryKey(DetailCarouselImg record);
}