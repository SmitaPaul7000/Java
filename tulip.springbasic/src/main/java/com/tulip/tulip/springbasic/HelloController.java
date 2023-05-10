package com.tulip.tulip.springbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello()
    {
        return "Hello from Tulip Spring Basic";
    }

}
