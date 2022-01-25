package com.fgm.createmanagefinancialgoals;

import com.fgm.createmanagefinancialgoals.entities.User;
import com.fgm.createmanagefinancialgoals.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CreatemanagefinancialgoalsApplication {
public static 	ApplicationContext context;
	public static void main(String[] args) {
		//SpringApplication.run(CreatemanagefinancialgoalsApplication.class, args);
		context=SpringApplication.run(CreatemanagefinancialgoalsApplication.class, args);
		//UserRepository userRepository=context.getBean(UserRepository.class);
		//User user=new User();
		//user.setName("Vishal");
		//user.setUserName("vishalkumar510@gmail.com");
		//user.setPassword("12345");
		//User user1=userRepository.save(user);
		//System.out.println(user1);
	}


}
