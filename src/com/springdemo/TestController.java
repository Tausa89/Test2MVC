package com.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping("/showFrom")
    public String displayTheForm(){
        return "silly";
    }

}
