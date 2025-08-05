package com.example.demo.controllers;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String HOME() {
        return "index";
    }

    @GetMapping("/groceries")
    public String GROCERIES(Model model) {
        model.addAttribute("features", Arrays.asList(
            "15 eggs",
            "2 liters of milk",
            "1 loaf of bread",
            "500 grams of cheese",
            "1 kg of apples",
            "5 kg of bananas",
            "1 kg of oranges"
        ));
        return "groceries";
    }

    @GetMapping("/age")
    public String AGE(@RequestParam(name = "years", required = false, defaultValue = "0") Integer years, Model model2) {
        model2.addAttribute("years", years);
        return "age";
    }
}