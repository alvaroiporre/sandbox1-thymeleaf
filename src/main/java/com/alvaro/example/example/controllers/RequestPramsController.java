package com.alvaro.example.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvaro.example.example.models.dto.ParamsDto;

import jakarta.servlet.http.HttpServletRequest;

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

  @GetMapping("bar")
  public ParamsDto bar(@RequestParam String text, @RequestParam Integer code) {
    ParamsDto param = new ParamsDto();
    param.setMessage(text);
    param.setCode(code);
    return param;
  }

  @GetMapping("request")
  public ParamsDto request(HttpServletRequest req) {
    ParamsDto param = new ParamsDto();
    param.setMessage(req.getParameter("text"));
    param.setCode(Integer.parseInt(req.getParameter("code")));
    return param;
  }
}
