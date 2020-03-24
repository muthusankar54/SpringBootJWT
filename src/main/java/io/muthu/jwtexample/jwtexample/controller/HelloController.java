package io.muthu.jwtexample.jwtexample.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class HelloController {

    @GetMapping("/hello")
public String welcome(){
    return "Hello World!!!!";
}

}
