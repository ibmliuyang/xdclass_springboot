package net.xdclass.demo.controller;

import net.xdclass.demo.pojo.ServerSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: liuyang
 * @Date: 2018-12-2407:56
 * @Description: <描述>
 */
@RestController
public class PropertiesController {

    @Autowired
    private ServerSetting serverSetting ;

    @RequestMapping("v1/test_properties")
    public Object testProperties(){
        return serverSetting;
    }


//    @Autowired
//    private ServerSettings serverSettings;
//    @GetMapping("/v1/test_properties")
//    public Object testPeroperties(){
//
//
//
//        return serverSettings;
//    }

}