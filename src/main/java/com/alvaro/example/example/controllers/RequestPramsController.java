package com.alvaro.example.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvaro.example.example.models.dto.ParamsDto;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/params")
public class RequestPramsController {

  @GetMapping("/foo")
  public ParamsDto foo(@RequestParam(required = false, defaultValue = "No content in param message", name = "mensaje") String message) {
    ParamsDto param = new ParamsDto();
    param.setMessage(message);
    return param;
  }
}
