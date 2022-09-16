package hu.asami.asamirestaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping( "/etlap")
@Controller
public class EtlapController {

    @GetMapping("")
    public String getEtlap(){
        return "etlap";
    }
}

