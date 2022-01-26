package com.fgm.createmanagefinancialgoals.repository;

import com.fgm.createmanagefinancialgoals.entities.Goals;
import com.fgm.createmanagefinancialgoals.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalsRepository extends JpaRepository<Goals,Integer> {
    List<Goals> findByUserName(String userName);
    //List<Goals> findByGoalsAnd(String goal);
    List<Goals> findByUserNameAndGoal(String userName, String goal);


}
