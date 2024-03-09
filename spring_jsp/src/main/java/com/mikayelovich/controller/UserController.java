package com.mikayelovich.controller;

import com.mikayelovich.model.User;
import com.mikayelovich.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute User user, BindingResult result) {
        userValidator.validate(user, result);
        if (result.hasErrors()) {
            return "form";
        }
        // handle user data
        return "index";
    }
}

