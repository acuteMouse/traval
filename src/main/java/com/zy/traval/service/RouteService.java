package com.zy.traval.service;

import com.zy.traval.bean.Route;

import java.util.List;

/**
 * @author cgl
 * @date 2018/9/28 21:29
 */
public interface RouteService {
    /**
     * 查询所有路线
     *
     * @return
     */
    List<Route> getAll();

    /**
     * 根据id查询
     *
     * @param routeId
     * @return
     */
    Route findById(Integer routeId);
}
