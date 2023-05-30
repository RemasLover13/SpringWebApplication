package ru.kpfu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kpfu.entities.User;
import ru.kpfu.services.*;

@Controller

public class MainController {

    @Autowired
   private UserService userService;

    @RequestMapping("/")
    public String showMainView() {
        return "mainPage";
    }


    @GetMapping("signUp")
    public String showRegisterView(Model model) {
        model.addAttribute("user", new User());
        return "signUpPage";
    }



    @PostMapping("signUp")
    public String executionRegisterView(@ModelAttribute("user") User user) {
        userService.addUser(user.getName(),user.getEmail(), user.getPassword());
        return "redirect:/signInPage";
    }


    @GetMapping("/signIn")
    public String showLoginForm() {
        return "signInPage";
    }

    @PostMapping("/login")
    public String processLoginForm() {
        return "redirect:/profilePage";
    }

    @GetMapping("/profile")
    public String showProfilePage() {
        return "profilePage";
    }




}
