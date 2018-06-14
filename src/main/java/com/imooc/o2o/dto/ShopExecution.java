package com.imooc.o2o.dto;

import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStatusEnum;

import java.util.List;

/**
 * Created by byinl on 2018/6/12 16:44.
 */
public class ShopExecution {
    //结果状态
    private int status;

    //状态标识
    private String statusInfo;

    //店铺数量
    private int shopCount;

    //操作的shop(增删改)
    private Shop shop;

    //shop列表(查询)
    private List<Shop> shopList;

    public ShopExecution() {

    }

    //店铺操作失败情况的构造器
    public ShopExecution(ShopStatusEnum statusEnum) {
        this.status = statusEnum.getStatus();
        this.statusInfo = statusEnum.getStatusInfo();
    }

    //店铺操作成功情况的构造器
    public ShopExecution(ShopStatusEnum statusEnum, Shop shop) {
        this.shop = shop;
        this.status = statusEnum.getStatus();
        this.statusInfo = statusEnum.getStatusInfo();
    }
    //店铺操作成功情况的构造器
    public ShopExecution(ShopStatusEnum statusEnum, List<Shop> shopList) {
        this.shopList = shopList;
        this.status = statusEnum.getStatus();
        this.statusInfo = statusEnum.getStatusInfo();
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }

    public int getShopCount() {
        return shopCount;
    }

    public void setShopCount(int shopCount) {
        this.shopCount = shopCount;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }
}




















