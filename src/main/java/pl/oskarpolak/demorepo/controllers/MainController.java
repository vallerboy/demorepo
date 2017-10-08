package pl.oskarpolak.demorepo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.oskarpolak.demorepo.models.services.StringService;

@Controller
public class MainController {

    StringService stringService = new StringService();

    @GetMapping("/")
    @ResponseBody
    public String index(){
        return "Czeesc! " + stringService.generateRandomString();
    }
}
