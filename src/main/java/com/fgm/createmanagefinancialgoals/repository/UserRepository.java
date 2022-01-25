package com.fgm.createmanagefinancialgoals.repository;

import com.fgm.createmanagefinancialgoals.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

     List<User> findByUserNameAndPassword(String userName, String password);

}
