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
    goodsInfo.setDescription("我们的自然莎负氧离子，功能主要在镜框上 ，镜框在成模之前，已经植入特殊成分：负氧离子…远红外线…锗元素…纳米银，对眼睛组织起到一个补充氧气，促进血液循环，排毒，抗癌，还可杀死650种细菌，这就是为什么人人带上就能受益，不管你信不信，它已经做到了");
    goodsInfo.setGoodsName("自然莎眼镜");
    goodsInfo.setGoodsTitle("自然莎眼镜");
    goodsInfo.setImgUrl("http://60.205.182.88:8080/pxun/images/main.jpg");
    goodsInfo.setShowPriority(222);
    goodsInfo.setDetailImgUrl("http://60.205.182.88:8080/pxun/images/main.jpg");
    goodsInfoMapper.insert(goodsInfo);
  }

}