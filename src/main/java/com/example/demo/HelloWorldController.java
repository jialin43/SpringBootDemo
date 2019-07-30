package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Johnny on 2019/7/30.
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
      return "hello world 599";
    }
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(name = "name",required = false,defaultValue = "World")String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }
}
