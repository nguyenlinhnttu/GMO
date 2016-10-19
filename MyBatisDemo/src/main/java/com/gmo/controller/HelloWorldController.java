package com.gmo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldController {
    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        String message = "Hello Spring MVC Config XML";
        return new ModelAndView("welcome", "message", message);
    }
}
