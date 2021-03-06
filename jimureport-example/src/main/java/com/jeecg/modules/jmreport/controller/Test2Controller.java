package com.jeecg.modules.jmreport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : bigxiaoxiao
 * @version 1.0
 * @description : TODO
 * @date :2022/3/24 11:18
 */
@RestController
@RequestMapping("/test2")
public class Test2Controller {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @RequestMapping(value = "/list2", method = RequestMethod.GET)
    public void queryPageList(HttpServletRequest req) {
        System.out.println("getMaxRows=" + jdbcTemplate.getMaxRows());
        System.out.println("getCacheLimit=" + namedParameterJdbcTemplate.getCacheLimit());
    }

    @PostMapping(value = "/update")
    public void update() {
        System.out.println("更新中。。。。");
    }

    @DeleteMapping(value = "/delete")
    public void delete() {
        System.out.println("删除中。。。。");
    }

    public void test() {
        System.out.println("添加一个测试方法");
    }

    public void test2() {
        System.out.println("test2");
    }
}
