package com.ReWear.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("home page handler");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model) {  
        model.addAttribute("isLogin", "false"); 
        System.out.println("about page handler");
        return "about";
    }

    // services
    @RequestMapping("/services")
    public String services() {
        System.out.println("service page handler");
        return "services";
    }

    
    //login
     @RequestMapping("/login")
    public String login() {
        System.out.println("login page handler");
        return "login";
     }
    
    //signup
    @GetMapping("/signup")
public String signup(Model model) {         
    return "signup";                                
}


        //signup
     @RequestMapping("/index")
    public String index() {
        System.out.println("index page handler");
        return "index";
    }

      @RequestMapping("/base")
    public String base() {
        System.out.println("base page handler");
        return "base";
    }
}
