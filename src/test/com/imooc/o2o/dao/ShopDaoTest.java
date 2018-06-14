package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created by byinl on 2018/6/12 14:15.
 */
public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;

    @Test
    public void insertShopTest() {
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

        shop.setShopName("测试的店铺");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");

        int effectNum = shopDao.insertShop(shop);
        Assert.assertEquals(1,effectNum);
    }

    @Test
    public void updateShopTest() {
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

        shop.setShopId(1L);
        shop.setShopName("测试的店铺_修改后");
        shop.setShopDesc("test");
        shop.setShopAddr("test");
        shop.setPhone("test");
        shop.setShopImg("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");

        int effectNum = shopDao.updateShop(shop);
        Assert.assertEquals(1,effectNum);
    }
}
