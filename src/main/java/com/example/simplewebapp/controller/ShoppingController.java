package com.example.simplewebapp.controller;

import com.example.simplewebapp.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShoppingController {

    @Autowired
    private ShoppingService shoppingService;

    @GetMapping("/calculate-total")
    public String calculateTotal(@RequestParam double amount, Model model) {
        double total = shoppingService.calculateTotal(amount);
        model.addAttribute("amount", amount);
        model.addAttribute("total", total);
        return "calculateTotal";
    }

    @GetMapping("/index")
    public String greeting(Model model) {
       model.addAttribute("message", "Welcome to our website!");
       return "index"; // Thymeleaf template name (greeting.html)
    }

}

