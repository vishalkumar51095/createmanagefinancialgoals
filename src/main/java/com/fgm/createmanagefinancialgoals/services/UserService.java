package com.fgm.createmanagefinancialgoals.services;

import com.fgm.createmanagefinancialgoals.entities.User;
import com.fgm.createmanagefinancialgoals.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }

    public void save(User std){
        repo.save(std);}

    public User get(String userName,String password){
        return (User) repo.findByUserNameAndPassword(userName,password);
    }


    public void delete(int id){
        repo.deleteById(id);
    }


}
