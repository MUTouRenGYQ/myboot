package com.spring.myboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @时间: ${Time}2018/12/3
 * @人:
 * @内容: 界面Controller
 */
@RestController
public class ViewController {

    @RequestMapping("/index")
     public String hello(){
        return "hello springBoot ";
     }

}
