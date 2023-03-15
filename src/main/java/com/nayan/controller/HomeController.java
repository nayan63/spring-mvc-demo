package com.nayan.controller;

import com.nayan.model.Users;
import com.nayan.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private UsersService usersService;
    @GetMapping("/add-user")
    public String addForm(RedirectAttributes redirectAttributes)
    {
        Map<String, ?> flashAttributes = redirectAttributes.getFlashAttributes();
        System.out.println(flashAttributes.get("error"));
        System.out.println("This is Home page");
        return "home";
    }

    @PostMapping("/add-action")
    public String addFormAction(@ModelAttribute("users") Users users, BindingResult bindingResult, RedirectAttributes redirectAttributes)
    {
        if(bindingResult.hasErrors())
        {
            redirectAttributes.addFlashAttribute("error", bindingResult.getFieldErrors());
            return "redirect:add-user";
        }
        return "add-users-form";
    }
}
