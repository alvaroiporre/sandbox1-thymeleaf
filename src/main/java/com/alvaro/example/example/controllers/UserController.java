package com.alvaro.example.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details (Model model) {
    model.addAttribute("title", "Hello world, spring boot!");
    model.addAttribute("name", "alvaro");
    return "details";
  }

}