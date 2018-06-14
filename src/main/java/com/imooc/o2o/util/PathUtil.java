package com.imooc.o2o.util;

/**
 * Created by byinl on 2018/6/12 15:45.
 */
public class PathUtil {
    private static String separator = System.getProperty("file.separator");
    public static String getImgBasePath() {
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/projectDev/image";
        } else {
            basePath = "/home/thunder/image";
        }
        return basePath.replace("/", separator);
    }

    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/item/shop/" + shopId + "/";
        return imagePath.replace("/", separator);
    }
}













