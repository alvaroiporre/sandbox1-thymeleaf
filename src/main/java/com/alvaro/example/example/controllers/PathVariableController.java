package com.alvaro.example.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaro.example.example.models.User;
import com.alvaro.example.example.models.dto.ParamsDto;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/var")
public class PathVariableController {
  @GetMapping("baz/{message}/{code}")
  public ParamsDto baz(@PathVariable String message, @PathVariable Integer code) {
    ParamsDto param = new ParamsDto();
    param.setMessage(message);
    param.setCode(code);
    return param;
  }
  
  @PostMapping("/create")
  public User create(@RequestBody User user) {
      
      return user;
  }
  
}
