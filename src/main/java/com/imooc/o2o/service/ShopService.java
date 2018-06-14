package com.imooc.o2o.service;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

import java.io.File;
import java.io.InputStream;

/**
 * Created by byinl on 2018/6/12 17:35.
 */
public interface ShopService {
    public ShopExecution addShop(Shop shop, InputStream shopInputStream,String fileName);
}
