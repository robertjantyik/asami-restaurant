package hu.asami.asamirestaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hetiajanlat")
@Controller
public class HetiajanlatController {

    @GetMapping("")
    public String getHetiajanlat(){
        return "hetiajanlat";
    }
}
