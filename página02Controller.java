package com.programem.teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class página02Controller {
    
    @GetMapping("/página02")
    public String página02(){
        return "página02";
    }
}