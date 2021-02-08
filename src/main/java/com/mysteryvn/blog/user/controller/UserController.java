package com.mysteryvn.blog.user.controller;

import com.mysteryvn.blog.user.model.User;
import com.mysteryvn.blog.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/user")
    public String login(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("message", "Please check username and password");
        return "login";
    }

    @PostMapping("/login/post")
    public String login(@ModelAttribute("user") User user, Model model) {
        this.userService.createUserWithRole(user, "USER");
       User userLoad = this.userService.login(user.getEmail(), user.getPassword());
       if (userLoad != null && userLoad.isEnable()) {
           return "redirect:/index";
       } else {
           return "redirect:/login-error";
       }
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        return "admin";
    }
}
