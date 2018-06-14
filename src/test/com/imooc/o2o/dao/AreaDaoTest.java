package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author OovEver
 * 2017/12/24 22:44
 */

public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaDao.queryArea();
        assertEquals(3, areaList.size());
    }

}
