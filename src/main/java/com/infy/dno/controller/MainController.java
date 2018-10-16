package com.infy.dno.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @RequestMapping("/")
    public String test() {
        return "test";
    }

    @RequestMapping("/main")
    public String getMain() {
        return "DNO";
    }


}
