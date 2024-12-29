package com.phuccoder.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.phuccoder.laptopshop.domain.User;
import com.phuccoder.laptopshop.service.UserService;

@Controller
public class ListUserController {
    final private UserService userService;

    public ListUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin/user/listuser")
    public String getListUserPage(Model model) {
        List<User> user = this.userService.getListUser();
        model.addAttribute("users", user);
        System.out.println(user);
        return "admin/user/listuser";
    }
}
