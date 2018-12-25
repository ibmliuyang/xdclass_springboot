package net.xdclass.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liuyang
 * @Date: 2018-12-2201:27
 * @Description: <描述>
 */

@RestController
public class OtherHttpController {


    Map params =new HashMap();

    @RequestMapping("hello")
    public Object hello(){

        return "hello";
    }

    @PostMapping("v1/login")
    public Object login(String id,String pwd){
        params.clear();
        params.put("id", id);
        params.put("pwd", pwd);
        return params;
    }

    @PutMapping("v1/put")
    public Object getUser(String id){
        params.clear();
        params.put("id",id);
        return params;
    }


    @DeleteMapping("v1/del")
    public Object delUser(String id){
        params.clear();
        params.put("id",id);
        return params;
    }
}