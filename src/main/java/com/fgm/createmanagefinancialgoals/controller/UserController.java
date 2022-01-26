package com.fgm.createmanagefinancialgoals.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/userregistration")
    public String home() {
        return "userregistration";
    }
    @RequestMapping("/goalcreate")
    public String goal(){
        return "goalcreate";
    }
    @RequestMapping("payinstallment")
    public String insta(){
        return "payinstallment";
    }
    @RequestMapping("/wishlist")
    public String wishlist(){
        return "wishlist";
    }

    @RequestMapping("/listofpaidinstallments")
    public String installments(){
        return "listofpaidinstallments";
    }

    @RequestMapping("/updategoal")
    public String updategoal(){
        return "updategoal";
    }

    @RequestMapping("/deletegoal")
    public String deletegoal(){
        return "deletegoal";
    }


}
