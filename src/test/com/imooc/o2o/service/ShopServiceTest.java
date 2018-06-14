package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import com.imooc.o2o.enums.ShopStatusEnum;
import com.imooc.o2o.service.ShopService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.Date;

/**
 * Created by byinl on 2018/6/12 18:19.
 */
public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;

    @Test
    public void addShopTest() throws FileNotFoundException {
        Shop shop = new Shop();
        Area area = new Area();
        PersonInfo owner = new PersonInfo();
        ShopCategory shopCategory = new ShopCategory();

        owner.setUserId(1L);
        area.setAreaId(1);
        shopCategory.setShopCategoryId(1L);

        shop.setShopCategory(shopCategory);
        shop.setArea(area);
        shop.setOwner(owner);

        shop.setShopName("测试addService");
        shop.setShopDesc("test1");
        shop.setShopAddr("test1");
        shop.setPhone("test1");
        shop.setShopImg("test1");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(ShopStatusEnum.CHECK.getStatus());
        shop.setAdvice("审核中");
        File file = new File("C:\\Users\\fzhiy\\Desktop\\jloginbg03.jpg");
        InputStream shopImg = new FileInputStream(file) ;
        ShopExecution shopExecution = shopService.addShop(shop, shopImg,file.getName());
        Assert.assertEquals(ShopStatusEnum.CHECK.getStatus(), shopExecution.getStatus());
//        int effectNum = shopDao.updateShop(shop);
//        Assert.assertEquals(1,effectNum);
    }
}
