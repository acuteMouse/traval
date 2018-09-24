package com.zy.traval.controller;

import com.zy.traval.bean.Test;
import com.zy.traval.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author cgl
 * @CreateTime 2018/9/24
 * @Update
 */
@Controller
public class TestController {

    @Autowired
    TestDao testDao;

    @RequestMapping("test")
    @ResponseBody
    public String test() {
        return "test";
    }


    @RequestMapping("test2")
    @ResponseBody
    public String all() {
        Optional<Test> test=testDao.findById(1);
        if (test.isPresent()){
            Test restl=test.get();
        }
        return "success";
    }

    @RequestMapping("index")
    public String index(Model model) {
        model.addAttribute("index", "index");
        return "index";
    }

}
