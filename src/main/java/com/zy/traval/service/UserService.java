package com.zy.traval.service;

import com.zy.traval.bean.User;

/**
 * @author cgl
 * @date 2018/9/28 21:16
 */
public interface UserService {
    User login(String username,String password);

}
