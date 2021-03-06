package com.pei.billinginquiry.example.controller;

import com.pei.billinginquiry.example.model.Hello;
import com.pei.billinginquiry.example.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marco Alvarado <marco.alvarado@softtek.com>
 * @date Sep 7, 2017
 */
@RestController
@RequestMapping("/hello")
public class HelloController
{
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    
    @Autowired
    private HelloService helloService;
    
    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public Hello getHelloWorld() {
        Hello hello = helloService.getLastPolicy();
        logger.debug("First web services invoked {}" , hello);
        return hello;
    }
}
