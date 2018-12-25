package net.xdclass.demo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author: liuyang
 * @Date: 2018-12-2423:55
 * @Description: <描述>
 */

@WebListener
public class RequestListenner implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

        System.out.println("this is RequestListenner Destroyed.");

    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("this is requestListenner requestInit .");


    }
}