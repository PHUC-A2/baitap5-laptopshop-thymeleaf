package com.phuccoder.laptopshop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.phuccoder.laptopshop.domain.User;
import com.phuccoder.laptopshop.service.UserService;

@Controller
public class UserController {

    final private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHelloPage() {
        return "admin/user/hello"; // trả về trang hello.html
    }

    @GetMapping("/admin/user/tableuser")
    public String getTableUserPage(Model model) {
        List<User> user = this.userService.getListUser();
        model.addAttribute("users", user);
        System.out.println(user);
        return "admin/user/tableuser";
    }

}
