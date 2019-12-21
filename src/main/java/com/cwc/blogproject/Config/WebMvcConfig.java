package com.cwc.blogproject.Config;

import com.cwc.blogproject.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*跳转主页页面*/
        registry.addViewController("/index").setViewName("index");
        /*跳转到内容页面*/
        registry.addViewController("/detail").setViewName("detail");
        /* 跳转登录注册页面*/
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        /*跳转分类页面*/
        registry.addViewController("/types").setViewName("types");
    }
    /*拦截器配置*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).excludePathPatterns("/**");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
