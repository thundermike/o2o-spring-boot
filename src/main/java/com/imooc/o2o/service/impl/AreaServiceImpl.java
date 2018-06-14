package com.imooc.o2o.service.impl;

import com.imooc.o2o.dao.AreaDao;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OovEver
 * 2017/12/24 22:59
 */
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
