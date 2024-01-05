package com.portfolio.HicPortFolio.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class MainController {

    @GetExchange("/home")
    @ResponseBody
    public String main(){
        return "홈";
    }
    
}
