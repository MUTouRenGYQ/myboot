package com.spring.myboot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @时间: ${Time}2018/12/3
 * @人: gyq
 * @内容:错误界面
 * 异常捕获的核心标签：@ControllerAdvice   +   @ExceptionHandler(RuntimeException.class)
 */
@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(RuntimeException.class)
    @RequestMapping
     public String errorPage(){
        return "index";
    }
}
