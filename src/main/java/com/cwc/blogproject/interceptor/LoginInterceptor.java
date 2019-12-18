package com.cwc.blogproject.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
* 拦截器
* */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user1 = request.getSession().getAttribute("user1");
        System.out.println("进入了拦截器");
        System.out.println(user1);
        if (request.getSession().getAttribute("user1")==null){
            request.getRequestDispatcher("/").forward(request,response);
        }
        return true;
    }

}
