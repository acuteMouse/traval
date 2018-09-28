package com.zy.traval.service.impl;

import com.zy.traval.bean.User;
import com.zy.traval.dao.UserDao;
import com.zy.traval.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cgl
 * @date 2018/9/28 21:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User login(String username, String password) {
        return userDao.findByUsernameAndPassword(username, password);
    }
}
