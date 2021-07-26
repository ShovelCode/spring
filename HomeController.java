package com.example.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  @RequestMapping("/")
  public String homePage(Model model){
    model.addAttributes("myvar", "Say hello to the people.");
    return "hometemplate";
  }
}

