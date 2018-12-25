package net.xdclass.demo.controller;

import net.xdclass.demo.pojo.MyException;
import net.xdclass.demo.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @Author: liuyang
 * @Date: 2018-12-2412:27
 * @Description: <描述>
 */
@RestController
public class TestGlobalExceptionController {
    @RequestMapping(value="/v1/test_ext")
    Object testExt(){
        int i = 1/0;
        User user = new User("zhangsan",19,new Date());
        return user;
    }


    @RequestMapping(value="/v1/my_ext")
    Object testMyExt(){

        throw new MyException("599","my ext 异常");

    }




}