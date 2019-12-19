package com.cwc.blogproject.Controller;

import com.cwc.blogproject.Entity.User;
import com.cwc.blogproject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /*用户登录*/
    @PostMapping("/userlogin")
    public String UserLogin(String username, String password,HttpSession session){
        User user1 = userService.getLogin(username,password);
        session.setAttribute("user1",user1);
        if (user1!=null) {
            return "redirect:index";
        }else {
            session.setAttribute("msg","用户名或密码错误");
            return "redirect:login";
        }
    }
    /*用户注册*/
    @PostMapping("/userregister")
    public String UsserRegister(User user){
        userService.addUser(user);
        return "redirect:login";
    }
    /*注销登录*/
    @GetMapping("/logout")
    public String LoGout( HttpSession session){
        session.removeAttribute("user1");
        return "redirect:index";
    }


}
