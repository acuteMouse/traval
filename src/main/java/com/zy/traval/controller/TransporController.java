package com.zy.traval.controller;

import com.zy.traval.common.annotion.RestMapping;
import com.zy.traval.common.util.ResponMap;
import com.zy.traval.service.TransportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cgl
 * @date 2018/9/26 21:43
 */
@Controller
@RequestMapping("transport")
public class TransporController {

    @Autowired
    TransportService transportService;

    /**
     * 查询所有的交通工具
     *
     * @return
     */
    @RestMapping("find")
    public ResponMap findAll() {
        ResponMap responMap = new ResponMap();
        try {
            responMap.setSuccess(transportService.findAll());
        } catch (Exception e) {
            responMap.setFail(e.getMessage());
        }
        return responMap;
    }
}
