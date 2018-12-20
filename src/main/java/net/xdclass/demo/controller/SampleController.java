package net.xdclass.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Map;

@Controller
@EnableAutoConfiguration
//@RestController
public class SampleController {


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test1")
    Map test1(){
       Map map = new HashMap();
       map.put("name", "zhangsan");
       map.put("age", "18");
       return map;
    }

}