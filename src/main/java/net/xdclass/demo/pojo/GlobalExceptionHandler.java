package net.xdclass.demo.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liuyang
 * @Date: 2018-12-2412:15
 * @Description: <描述>
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(value=Exception.class)
    Object handlerException(Exception e , HttpServletRequest request){
        log.error("url {}, mgs {}",request.getRequestURL(),e.getMessage());
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;
    }

    @ExceptionHandler(value=MyException.class)
    Object handlerMyException(MyException e,HttpServletRequest request){

       /*  返回页面给前端
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error.html");
        modelAndView.addObject("msg",e.getMessage());
        return modelAndView;*/


       // 返回json给前端

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code", e.getCode());
        map.put("msg", e.getMgs());
        map.put("url", request.getRequestURL());
        return map;

    }
}