package com.cwc.blogproject.Controller;

import com.cwc.blogproject.Entity.User;
import com.cwc.blogproject.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    /*用户登录*/
    @PostMapping("/userlogin")
    public String Userlogin(String username, String password,HttpSession session){
        User user1 = loginService.getLogin(username,password);
        session.setAttribute("user1",user1);
        if (user1!=null) {
            return "redirect:index";
        }else {
            return "redirect:login";
        }
    }
    /*注销登录*/
    @GetMapping("/logout")
    public String LoGout( HttpSession session){
        session.removeAttribute("user1");
        return "redirect:index";
    }


}
