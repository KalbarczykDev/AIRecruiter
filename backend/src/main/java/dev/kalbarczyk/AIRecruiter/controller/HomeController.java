package dev.kalbarczyk.AIRecruiter.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class HomeController {

  @GetMapping("/")
  public Map<String, String> index() {
    Map<String, String> response = new HashMap<>();
    response.put("message", "Home Controller works!");
    return response;
  }
}
