package com.fgm.createmanagefinancialgoals.entities;

import javax.persistence.*;

@Entity
@Table(name="GOALS")
public class Goals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String goal;
    private int goalTotal;

    @Override
    public String toString() {
        return "Goals{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", goal='" + goal + '\'' +
                ", goalTotal=" + goalTotal +
                '}';
    }

    public Goals(int id, String userName, String goal, int goalTotal) {
        super();
        this.id = id;
        this.userName = userName;
        this.goal = goal;
        this.goalTotal = goalTotal;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Goals(int id, String userName, int goalTotal) {
        super();
        this.id = id;
        this.userName = userName;
        this.goalTotal = goalTotal;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Goals() {
        super();
    }

    public Goals(int id, int goalAmount, int goalTotal) {
        super();
        this.id = id;
        this.goalTotal = goalTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoalTotal() {
        return goalTotal;
    }

    public void setGoalTotal(int goalTotal) {
        this.goalTotal = goalTotal;
    }
}
