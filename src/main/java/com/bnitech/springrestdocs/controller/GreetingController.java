package com.bnitech.springrestdocs.controller;

import com.bnitech.springrestdocs.dto.GreetingResponse;
import com.bnitech.springrestdocs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GreetingController {

  final private UserService userService;

  @GetMapping("/user/all")
  public GreetingResponse getAllUser() {
    return new GreetingResponse(userService.getUserInfoList());
  }
}
