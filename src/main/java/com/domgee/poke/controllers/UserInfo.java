package com.domgee.poke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserInfo {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "User Sign In");
        return "index";
    }
}
