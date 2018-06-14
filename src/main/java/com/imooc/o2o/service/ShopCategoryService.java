package com.imooc.o2o.service;

import com.imooc.o2o.entity.ShopCategory;

import java.util.List;

/**
 * Created by byinl on 2018/6/13 16:23.
 */
public interface ShopCategoryService {
    List<ShopCategory> getShopCategoryList(ShopCategory shopCategory);
}
