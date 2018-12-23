package net.xdclass.demo.controller;

import net.xdclass.demo.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import javax.servlet.http.HttpServletRequest;
import java.awt.print.Paper;
import java.util.Date;
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
    @RequestMapping("/test2")
    Map test2(){
        Map map = new HashMap();
        map.put("name", "zhangsan");
        map.put("age", "18");
        return map;
    }

    private Map params = new HashMap<>();
    @RequestMapping(path = "/{city_id}/{user_id}",method = RequestMethod.GET)
    public Object findUser(@PathVariable("city_id") String cityId,@PathVariable("user_id") String userId){
        params.clear();
        params.put("cityId", cityId);
        params.put("userId", userId);
        return params;
    }

    @GetMapping(path = "/v1/page_user1")
    public Object findUserGetMapping(int from,int size){
        params.clear();
        params.put("from", from);
        params.put("size", size);
        return params;
    }

    @RequestMapping(path="v1/save_user")
    public Object saveUser1(@RequestBody User user){
        params.clear();
        params.put("user", user);
        return user;
    }

    @GetMapping(path="v1/get_header")
    public Object getHeader(@RequestHeader("access_token") String accessToken,String id){
        params.clear();
        params.put("access_token", accessToken);
        params.put("id", id);
        return params;
    }

    @GetMapping(path="v1/test_request")
    public Object testRequest(HttpServletRequest request){
        params.clear();
        String id = request.getParameter("id");
        params.put("id", id);
        return params;
    }


    @GetMapping("/testjson")
    public Object testJson(){
        User user = new User();
        user.setAge(19);
        user.setUserName("lisi");
        user.setCreateDate(new Date());
        user.setPasswd("abc123");

    return user;
    }
}