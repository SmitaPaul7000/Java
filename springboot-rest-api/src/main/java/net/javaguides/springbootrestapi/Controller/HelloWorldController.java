package net.javaguides.springbootrestapi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {
    //Http Get Request
    //http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "Its my first api -- Hello World";
    }
}
