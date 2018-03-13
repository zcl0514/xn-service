package com.xiangnong.xnservice.mapper;

import com.xiangnong.xnservice.entity.DetailCarouselImg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest
public class DetailCarouselImgMapperTest {

    @Autowired
    private DetailCarouselImgMapper detailCarouselImgMapper;

    @Test
    public void insert() throws Exception {
        DetailCarouselImg detailCarouselImg = new DetailCarouselImg();
        detailCarouselImg.setGoodsId(2L);
        detailCarouselImg.setImgDesc("图片4");
        detailCarouselImg.setImgUrl("http://60.205.182.88:8080/pxun/images/detail4.jpg");
        detailCarouselImgMapper.insert(detailCarouselImg);
    }

}