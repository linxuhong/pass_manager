package com.shangguan.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: lxh_007@hotmail.com
 */
@Controller
public class DispacherController {
    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("update")
    public String update(){
        return "common";
    }
}
