package com.infy.dno.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/main")
    public String getMain() {
        return "DNO";
    }


}
