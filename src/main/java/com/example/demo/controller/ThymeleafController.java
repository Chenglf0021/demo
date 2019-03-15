package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenglf on 2019/3/4.
 */
@Controller
@RequestMapping(value="/th")
public class ThymeleafController {
    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("name", "haozz");
        return "index";
    }
}
