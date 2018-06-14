package com.imooc.o2o.dao.split;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by byinl on 2018/6/14 18:50.
 */
public class DynamicDataSourceHolder {
    private static Logger logger = LoggerFactory.getLogger(DynamicDataSourceHolder.class);
    private static ThreadLocal<String> contextHolder = new ThreadLocal<>();
    public static final String DB_MASTER = "master";
    public static final String DB_SLAVE = "slave";

    public static String getDbType() {
        String db = contextHolder.get();
        if (db == null) {
            db = DB_MASTER;
        }
        return db;
    }

    /**
     * 设置线程的DBTYPE
     * @param str
     */
    public static void setDbType(String str) {
        logger.debug("当前所使用的数据源是"+str);
        contextHolder.set(str);
    }

    /**
     * 清理连接类型
     */
    public static void clearDbType() {
        contextHolder.remove();
    }
}
