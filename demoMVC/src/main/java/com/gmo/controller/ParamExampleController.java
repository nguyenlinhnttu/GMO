package com.gmo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamExampleController {
    @RequestMapping(value = "/paramater", method = RequestMethod.GET)
    public String getParam(ModelMap model,
        @RequestParam(value = "name") String name ){
       
        model.addAttribute("name",name);
        if(name.equals("admin")){
            model.addAttribute("email","nguaaayenlinh.nttu@gmail.com");
        } else {    
            model.addAttribute("email","no mail");
        }
        return "paramater";
    }
}
