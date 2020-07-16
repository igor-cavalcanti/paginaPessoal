package com.programem.teste;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class página03Controller {
    
    @GetMapping("/página03")
    public String página03(){
        return "página03";
    }
}