package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yuqia on 2018/4/7.
 */

/**
 * HelloController是一个实现Controller接口的控制器，
 * 可处理一个单一的请求动作
 */

public class HelloController implements Controller{
    private static final Log logger = LogFactory.getLog(HelloController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("handleRequest被调用");
        //创建准备返回的ModelView对象，该对象包含了返回视图名、模型的名称以及模型对象
        ModelAndView mv = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象
        mv.addObject("message", "Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        //返回ModelAndView对象
        return mv;
    }
}

/**
 * HelloController是一个基于注解的控制器，
 * 可同时处理多个请求动作，并且无须实现任何接口
 */
/*
@org.springframework.stereotype.Controller
public class HelloController {
    private static final Log logger = LogFactory.getLog(HelloController.class);

    public ModelAndView hello() {
        logger.info("handleRequest被调用");
        //创建准备返回的ModelView对象，该对象包含了返回视图名、模型的名称以及模型对象
        ModelAndView mv = new ModelAndView();
        //添加模型数据，可以是任意的POJO对象
        mv.addObject("message", "Hello World!");
        //设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        //返回ModelAndView对象
        return mv;
    }
}*/


