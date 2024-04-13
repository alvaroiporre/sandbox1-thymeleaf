package com.alvaro.example.example.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaro.example.example.models.User;
import com.alvaro.example.example.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public UserDto details () {
    UserDto userDto = new UserDto();
    User user = new User("alvaro", "Java");
    userDto.setUser(user);
    userDto.setTitle("Using DTO");

    
    return userDto;
  }

  // @GetMapping("/details")
  // public Map<String, Object> details () {
  //   User user = new User("alvaro", "Java");

  //   Map<String, Object> body = new HashMap<>();
  //   body.put("title", "title");
  //   body.put("user", user);
  //   return body;
  // }

  

}