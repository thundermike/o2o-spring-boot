package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by byinl on 2018/6/13 16:09.
 */
public class ShopCategoryDaoTest extends BaseTest {
    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Test
    public void queryShopCategoryTest() {

        ShopCategory shopCategory = new ShopCategory();
        ShopCategory shopCategory_p = new ShopCategory();
        shopCategory_p.setShopCategoryId(1L);
        shopCategory.setParent(shopCategory_p);
        List<ShopCategory> shopCategoryList = shopCategoryDao.queryShopCategory(shopCategory);
        Assert.assertEquals(1,shopCategoryList.size());
    }
}
