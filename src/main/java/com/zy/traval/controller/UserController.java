package com.zy.traval.controller;

import com.zy.traval.bean.User;
import com.zy.traval.common.annotion.RestMapping;
import com.zy.traval.dao.UserDao;
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

    @Autowired
    UserDao userDao;

    /**
     * 登陆
     *
     * @param username
     * @param password
     * @return
     */
    @RestMapping("login")
    public User login(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, password);
        return user;
    }
}
