package com.cwc.blogproject.Config;

import com.cwc.blogproject.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*跳转主页页面*/
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        /* 跳转登录页面*/
        registry.addViewController("/login").setViewName("login");
        /*跳转分类页面*/
        registry.addViewController("/types").setViewName("types");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
