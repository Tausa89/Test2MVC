package com.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {



    @RequestMapping("/showFrom")
    public String showForm(){
        return "helloword-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloword";
    }

    @RequestMapping("/processFormVersionTwo")
    public String lestShout(HttpServletRequest reguest, Model model){
        String name = reguest.getParameter("studentName");
        name = name.toUpperCase();
        String result = "Yo " + name;
        model.addAttribute("message", result);
        return "helloword";

    }


    @RequestMapping("/processFormVersionThree")
    public String processFromVersionThree(@RequestParam("studentName") String name, Model model){
        name = name.toUpperCase();
        String result = "Something new v3 " + name;
        model.addAttribute("message", result);
        return "helloword";

    }
}
