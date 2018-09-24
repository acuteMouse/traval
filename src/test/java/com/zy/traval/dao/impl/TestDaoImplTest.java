package com.zy.traval.dao.impl;

import com.zy.traval.bean.Test;
import com.zy.traval.dao.TestDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author cgl
 * @date 2018/9/24 18:20
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDaoImplTest {
    @Autowired
    TestDao testDao;

    public void test() {
        Test test = new Test();
        test.setId(1);


    }

}