package com.fgm.createmanagefinancialgoals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/home")
    public String home() {
        return "home";
    }
    @RequestMapping("/goalcreate")
    public String goal(){
        return "goalcreate";
    }
    @RequestMapping("getInstallment")
    public String insta(){
        return "installment";
    }
    @RequestMapping("/getdetails")
    public String getdetails(){
        return "getdetails";
    }

    @RequestMapping("/getInstall")
    public String installments(){
        return "getinstall";
    }


}
