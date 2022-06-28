package springbootfirst.demo.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("hi")
    public String nicetomeetyou(Model model){
        model.addAttribute("username","ju0");
        return "greetings";
    }




}
