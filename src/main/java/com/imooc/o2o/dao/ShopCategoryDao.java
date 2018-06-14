package com.imooc.o2o.dao;

import com.imooc.o2o.entity.ShopCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by byinl on 2018/6/13 15:59.
 */
public interface ShopCategoryDao {
    List<ShopCategory> queryShopCategory(ShopCategory shopCategory);
}
