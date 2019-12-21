package com.cwc.blogproject.Controller;

import com.cwc.blogproject.Entity.Blog;
import com.cwc.blogproject.Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private BlogService blogService;

    /*初始化主页数据*/
    @GetMapping("/")
    public String bloglist(Model model){
        List<Blog> blogs = blogService.selectAll();
        model.addAttribute("blogs",blogs);
        return "index";
    }

}
