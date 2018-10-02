package com.zy.traval.controller;

import com.zy.traval.bean.User;
import com.zy.traval.common.annotion.RestMapping;
import com.zy.traval.common.util.ResponMap;
import com.zy.traval.dao.UserDao;
import com.zy.traval.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户相关接口
 *
 * @author cgl
 * @date 2018/9/28 9:44
 */
@Controller
@RequestMapping("user")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    /**
     * 登陆
     *
     * @param username
     * @param password
     * @return
     */
    @RestMapping("login")
    public ResponMap login(String username, String password) {
        ResponMap responMap = new ResponMap();
        try {
            User user=userService.login(username, password);
            if (user!=null){
                responMap.setSuccess(user);
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
            responMap.setFail(e.getMessage());
        }
        return responMap;
    }
}
