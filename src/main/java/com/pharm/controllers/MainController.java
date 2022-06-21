package com.pharm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    // Login form
    @RequestMapping("/login")
    public String login() {
        return "login.html";
    }

    // Login form with error
    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login.html";
    }

    @RequestMapping("/logout")
    public String logout(Model model) {
        return "login.html";
    }

    @RequestMapping("/")
    public String blank(){
        return "blank.html";
    }

    @RequestMapping("/lieky")
    public String lieky() {
        return "tables.html";
    }


}