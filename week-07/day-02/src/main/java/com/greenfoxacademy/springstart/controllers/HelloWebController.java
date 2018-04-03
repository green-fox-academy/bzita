package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam("name") String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("counter", atomicLong.incrementAndGet());
    return "greeting";
  }
}


 /* public Greeting greetingMethod(@RequestParam("name") String name) { //http://localhost:8080/greeting?name=Yourname
    return new Greeting(1, "Hello " + name + "!");
  }

 @RequestMapping("/web/greeting")
  public String greeting(Model model) {
    model.addAttribute("name", " World");
    return "greeting";
  }*/