package com.phuccoder.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.phuccoder.laptopshop.domain.User;
import com.phuccoder.laptopshop.service.UserService;

@Controller
public class CreateUserController {

    final private UserService userService;

    public CreateUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/admin/user/create")
    public String getCreatePage(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @PostMapping("/admin/user/create") // lấy từ action bên html
    public String createUser(@ModelAttribute("newUser") User phuccoder) {
        this.userService.saveUser(phuccoder);
        return "redirect:/admin/user/tableuser";
    }

}
