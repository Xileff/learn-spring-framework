package com.in28minutes.springboot.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        logger.info("Say Hello JSP");
        return "sayHello";
    }
}
