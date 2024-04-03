package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/save")
    public String save(@RequestParam String name, Model model) {
        // Here you can implement logic to save the data to PostgreSQL
        // For simplicity, let's just echo back the name
        model.addAttribute("name", name);
        return "result";
    }
}
