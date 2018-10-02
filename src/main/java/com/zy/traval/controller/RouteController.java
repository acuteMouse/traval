package com.zy.traval.controller;

import com.zy.traval.bean.Route;
import com.zy.traval.common.annotion.RestMapping;
import com.zy.traval.common.util.ResponMap;
import com.zy.traval.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author cgl
 * @date 2018/9/28 21:31
 */
@Controller
@RequestMapping("route")
public class RouteController {

    @Autowired
    RouteService routeService;

    @RestMapping("getAll")
    public ResponMap getAll() {
        ResponMap responMap = new ResponMap();
        try {
            List<Route> routes = routeService.getAll();
            if (routes != null) {
                responMap.setSuccess(routes);
            }
        } catch (Exception e) {
        }
        return responMap;
    }

    @RestMapping("detail")
    public ResponMap detail(Integer routeId) {
        ResponMap responMap = new ResponMap();
        try {
            Route route = routeService.findById(routeId);
            if (route != null) {
                responMap.setSuccess(route);
            }
        } catch (Exception e) {
            e.printStackTrace();
            responMap.setFail(e.getMessage());
        }
        return responMap;
    }
}
