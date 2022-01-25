package com.fgm.createmanagefinancialgoals.restcontroller;

import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RegisterUser")
public class UserRestController {

    @RequestMapping("/")
    public String RegisterUser(){
        return "index";
    }

}
