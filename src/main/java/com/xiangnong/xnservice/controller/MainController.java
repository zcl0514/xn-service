package com.xiangnong.xnservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("main")
@Controller
public class MainController {

  @RequestMapping("/index")
  public String index() {
    return "index";
  }

}
