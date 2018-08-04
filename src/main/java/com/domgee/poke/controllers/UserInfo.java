package com.domgee.poke.controllers;

import com.domgee.poke.models.User;
import com.domgee.poke.models.data.UserDao;
import com.domgee.poke.models.data.forms.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;


@Controller
public class UserInfo {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        UserStorage user = new UserStorage();
        model.addAttribute("title", "User Sign In");
        model.addAttribute("user", user);
        return "index";
    }
    @RequestMapping(value = "validate")
    public String valid(Model model) {
        UserStorage user = new UserStorage();
        model.addAttribute("title", "User Sign In");
        model.addAttribute("user", user);
        return "index";
    }
    @RequestMapping(value = "validate", method= RequestMethod.POST)
    public String add(@ModelAttribute UserStorage user,
                      Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "User Sign In");
            model.addAttribute("user", user);
            model.addAttribute("errors", errors);
            return "index";
        }
        //TODO: Turn my password into a hashandsalt.
        //TODO: store the whole thing as a type of User object, not saved to the database yet...
        //TODO: pass the new object into the next view

        model.addAttribute("title", "More User Information");
        model.addAttribute("user", user);
        return "temp";
    }

    @RequestMapping(value = "validateExist", method= RequestMethod.POST)
    public String validateExist(@ModelAttribute @Valid UserStorage user,
                      Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "User Sign In");
            model.addAttribute("user", user);
            return "index";
        }
        //TODO: Get the appropriate user from database
        //TODO: Get their associated Pokemon
        //TODO: Run the related search and return velevant objects
        //TODO: redirect to search results page that displays their data at the top

//        model.addAttribute("title", "More User Information");
//        model.addAttribute("user", );
         return "redirect:userStats";  //this is the incorrect link, intellij forced a return statement on me.
    }


}
