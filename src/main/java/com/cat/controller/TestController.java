package com.cat.controller;

import com.cat.domain.User;
import com.cat.service.user.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/userTest")
public class TestController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public void getUser(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView();
        User user = userService.getUser(1);
        Gson gson  = new Gson();
        String s = gson.toJson(user);
        System.out.println(s);
        modelAndView.addObject("userInfo",s);
    }

}
