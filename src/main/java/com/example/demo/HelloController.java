package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 炜 on 2017/5/16.
 */
@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value= "/hi")
    public String hi(@RequestParam String name){
        return  helloService.hiService(name);
    }
}
