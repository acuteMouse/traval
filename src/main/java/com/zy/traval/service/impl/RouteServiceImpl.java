package com.zy.traval.service.impl;

import com.zy.traval.bean.Route;
import com.zy.traval.dao.RouteDao;
import com.zy.traval.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author cgl
 * @date 2018/9/28 21:29
 */
@Service
public class RouteServiceImpl implements RouteService {


    @Autowired
    RouteDao routeDao;

    @Override
    public List<Route> getAll() {
        return routeDao.findAll();
    }

    @Override
    public Route findById(Integer routeId) {
        return routeDao.getOne(routeId);
    }
}
