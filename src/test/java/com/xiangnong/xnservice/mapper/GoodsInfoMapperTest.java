package com.xiangnong.xnservice.mapper;

import com.xiangnong.xnservice.entity.GoodsInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class GoodsInfoMapperTest {

  @Autowired
  private GoodsInfoMapper goodsInfoMapper;

  @Test
  public void insert() throws Exception {
    GoodsInfo goodsInfo = new GoodsInfo();
    goodsInfo.setDescription("fssdfsdf");
    goodsInfo.setGoodsName("傻逼");
    goodsInfo.setGoodsTitle("woc");
    goodsInfo.setImgUrl("http://fdssfds");
    goodsInfoMapper.insert(goodsInfo);
  }

}