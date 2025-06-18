package com.anwar.aop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
  @GetMapping("/get-employee")
  public String getEmployee() {
    return "Hello World";
  }
}
