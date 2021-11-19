package com.sisyphuswxg.chapter14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    SisyphuswxgProperties sisyphuswxgProperties;

    @RequestMapping("/hello")
    public String index() {
        return sisyphuswxgProperties.toString();
    }

}