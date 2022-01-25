package com.fgm.createmanagefinancialgoals.restcontroller;

import com.fgm.createmanagefinancialgoals.CreatemanagefinancialgoalsApplication;
import com.fgm.createmanagefinancialgoals.entities.Goals;
import com.fgm.createmanagefinancialgoals.entities.Installments;
import com.fgm.createmanagefinancialgoals.entities.User;
import com.fgm.createmanagefinancialgoals.repository.GoalsRepository;
import com.fgm.createmanagefinancialgoals.repository.InstallmentsRepository;
import com.fgm.createmanagefinancialgoals.repository.UserRepository;
import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CreateGoalRestController {

    @PostMapping("/goals")
    public String CreateGoal(@RequestParam(value = "userName", defaultValue = "", required = false) String userName, @RequestParam(value = "password", defaultValue = "", required = false) String password, @RequestParam(value = "goal", defaultValue = "0", required = false) String goal, @RequestParam(value = "goalTotal", defaultValue = "0", required = false) int goalTotal) {
        try {
            ApplicationContext context = CreatemanagefinancialgoalsApplication.context;
            //ApplicationContext context= SpringApplication.run(CreatemanagefinancialgoalsApplication.class);
            UserRepository userRepository = context.getBean(UserRepository.class);
            List<User> userList = userRepository.findByUserNameAndPassword(userName, password);

            GoalsRepository goalsRepository = context.getBean(GoalsRepository.class);
            if (userList.size() <= 0)
                throw new Exception("Invalid username or password");
            Goals goals = new Goals();
            goals.setUserName(userName);
            goals.setGoal(goal);
            goals.setGoalTotal(goalTotal);
            Goals goals1 = goalsRepository.save(goals);

            return goals1.toString();
            //return "User:" + userName + "Password:"+password+ "goalAmount:" + goalAmount + "goalTotal:" + goalTotal;
        } catch (Exception e) {
            System.out.println(e);
            return "" + e;
        }
    }
    @PostMapping("/installment")
    public String Installment(@RequestParam(value = "userName", defaultValue = "", required = false) String userName, @RequestParam(value = "password", defaultValue = "", required = false) String password, @RequestParam(value = "instaAmount", defaultValue = "0", required = false) int instaAmount) {
        try{
            ApplicationContext context = CreatemanagefinancialgoalsApplication.context;
            UserRepository userRepository = context.getBean(UserRepository.class);
            List<User> userList = userRepository.findByUserNameAndPassword(userName, password);

            InstallmentsRepository installmentsRepository=  context.getBean(InstallmentsRepository.class);


            if(userList.size()<=0)
                throw new Exception("Invalid username or password");
            Installments installments=new Installments();
            installments.setUserName(userName);
            installments.setInstaAmount(String.valueOf(instaAmount));

            Installments installments1=installmentsRepository.save(installments);

            return installments1.toString();
        }
        catch (Exception e)
        {
            System.out.println(e);
            return "" + e;
        }

    }

    @RequestMapping("/userpage")
    public String user(@RequestParam(value = "name", defaultValue = "", required = false) String name, @RequestParam(value = "userName", defaultValue = "0", required = false) String userName, @RequestParam(value = "password", defaultValue = "0", required = false) String password) {
        try {
            ApplicationContext context = CreatemanagefinancialgoalsApplication.context;
            //ApplicationContext context= SpringApplication.run(CreatemanagefinancialgoalsApplication.class);
            UserRepository userRepository = context.getBean(UserRepository.class);
            User user = new User();
            user.setName(name);
            user.setUserName(userName);
            user.setPassword(password);
            User user1 = userRepository.save(user);


            return user1.toString();//"Name:" + name + "UserName:" + userName + "Password:" + password;
        } catch (Exception e) {
            System.out.println(e);
            return "" + e;
        }
    }

    @PostMapping("/showdetails")
    public String showdetails(@RequestParam(value = "userName", defaultValue = "0", required = false) String userName, @RequestParam(value = "password", defaultValue = "0", required = false) String password) throws Exception {
       try {
           ApplicationContext context = CreatemanagefinancialgoalsApplication.context;
           UserRepository userRepository = context.getBean(UserRepository.class);
           List<User> userList = userRepository.findByUserNameAndPassword(userName, password);
           if (userList.size() <= 0)
               throw new Exception("Invalid username or password " + userName + "  " + password );
           GoalsRepository goalsRepository=context.getBean(GoalsRepository.class);
           List<Goals> showgoal=goalsRepository.findByUserName(userName);
           Gson gson=new Gson();
           return gson.toJson( showgoal);
       }
       catch (Exception e){
           return ""+e;
       }
    }

    @PostMapping("/showinstallments")
    public String showinstallments(@RequestParam(value = "userName", defaultValue = "0", required = false) String userName, @RequestParam(value = "password", defaultValue = "0", required = false) String password){
        try{
            ApplicationContext context = CreatemanagefinancialgoalsApplication.context;
            UserRepository userRepository = context.getBean(UserRepository.class);
            List<User> userList = userRepository.findByUserNameAndPassword(userName, password);
            int total=0;
            if (userList.size() <= 0)
                throw new Exception("Invalid username or password " + userName + "  " + password );
            InstallmentsRepository installmentsRepository=context.getBean(InstallmentsRepository.class);
            List<Installments> installments=installmentsRepository.findByUserName(userName);
            for(Installments install : installments)
            {
                total+= Integer.parseInt( install.getInstaAmount());
            }
            //int totalInstall=installmentsRepository.selectTotals();
            A a=new A();
            a.installments=installments;
            a.total=total;
            Gson gson=new Gson();

            return gson.toJson(a);

        }
        catch (Exception e){
            return ""+e;
        }
    }


    @PostMapping("/hi")
    public String hi() {
        return "hi";
    }
}
class A
{
    public List<Installments> installments;
    public int total;
}