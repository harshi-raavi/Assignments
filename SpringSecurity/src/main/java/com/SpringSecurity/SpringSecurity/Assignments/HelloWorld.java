package com.SpringSecurity.SpringSecurity.Assignments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
   @GetMapping("/adminnn")
   public String Admin() {
	   return "Hello Admin";
   }
   @GetMapping("/userss")
   public String User() {
	   return "Hello User";
   }
   @GetMapping("/")
   public String sayHello() {
	   return "Hello World";
   }
}
