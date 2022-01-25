package com.fgm.createmanagefinancialgoals.entities;

import javax.persistence.*;

@Entity
@Table(name="INSTALLMENTS")
public class Installments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private String instaAmount;

    public Installments() {
        super();
    }


    @Override
    public String toString() {
        return "Installments{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", instaAmount='" + instaAmount + '\'' +
                '}';
    }

    public Installments(int id, String userName, String instaAmount) {
        super();
        this.id = id;
        this.userName = userName;
        this.instaAmount = instaAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getInstaAmount() {
        return instaAmount;
    }

    public void setInstaAmount(String instaAmount) {
        this.instaAmount = instaAmount;
    }
}
