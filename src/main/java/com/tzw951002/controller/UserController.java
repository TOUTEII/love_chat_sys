package com.tzw951002.controller;

import com.tzw951002.pojo.User;
import com.tzw951002.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServices userServices;

    @RequestMapping("/getUser")
    public String getUserById(String id, Model model){
        User user = userServices.getUserById(id);
        model.addAttribute("user",user);
        return "user_list";
    }
}
