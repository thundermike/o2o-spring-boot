package com.imooc.o2o.service;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author OovEver
 * 2017/12/24 23:00
 */
public class AreaServiceTest extends BaseTest {
    @Autowired
    private AreaService areaService;
    @Test
    public void testGetAreaList() {
        List<Area> areaList = areaService.getAreaList();
        System.out.println(areaList.get(0).getAreaName());
    }

}