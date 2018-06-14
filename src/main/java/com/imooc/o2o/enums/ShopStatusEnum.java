package com.imooc.o2o.enums;

/**
 * Created by byinl on 2018/6/12 16:50.
 */
public enum ShopStatusEnum {
    CHECK(0,"审核中"),
    OFFLINE(-1,"非法店铺"),
    SUCCESS(1,"操作成功"),
    INNER_ERROR(-1001,"内部系统错误"),
    NULL_SHOP_ID(-1002,"ShopId为空"),
    NULL_SHOP(-1003,"shop信息为空");

    private int status;
    private String statusInfo;

    private ShopStatusEnum(int status, String statusInfo) {
        this.status = status;
        this.statusInfo = statusInfo;
    }

    public static ShopStatusEnum statusOf(int status) {
        for (ShopStatusEnum shopStatusEnum : values()) {
            if (shopStatusEnum.getStatus() == status) {
                return shopStatusEnum;
            }
        }
        return null;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusInfo() {
        return statusInfo;
    }
}
