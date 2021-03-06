package com.zy.traval.dao;

import com.zy.traval.bean.User;
import com.zy.traval.common.BaseDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author cgl
 * @date 2018/9/28 9:43
 */
@Repository
public interface UserDao extends BaseDao<User> {

    /**
     * 根据用户名和密码查询
     *
     * @param username
     * @param password
     * @return
     */
    User findByUsernameAndPassword(String username, String password);
}
