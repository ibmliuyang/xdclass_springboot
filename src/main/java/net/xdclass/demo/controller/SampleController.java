package net.xdclass.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.HashMap;
import java.util.Map;

//@Controller
//@EnableAutoConfiguration
@RestController
public class SampleController {


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test1")
    @ResponseBody
    Map test1(){
       Map map = new HashMap();
       map.put("name", "zhangsan");
       map.put("age", "18");
       return map;
    }

    private Map<String,String> params = new HashMap<>();
   /* @RequestMapping(path = "/{city_id}/{user_id}",method = RequestMethod.GET)
    public Object findUser(@PathVariable("city_id") String cityId,@PathVariable("user_id") String userId){
        params.clear();
        params.put("cityId", cityId);
        params.put("userId", userId);
        return params;
    }*/

    @GetMapping(path = "/{city_id}/{user_id}")
    public Object findUserGetMapping(@PathVariable("city_id") String cityId,@PathVariable("user_id") String userId){
        params.clear();
        params.put("cityId", cityId);
        params.put("userId", userId);
        return params;
    }
}