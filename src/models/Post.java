/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Blob;
import java.sql.Timestamp;

/**
 *
 * @author PHUTRAN
 */
public class Post {
    private int id;
    private double raiseMoney, goalMoney;
    private int raisePeople, goalPeople;
    private String title, description;
    private Blob image;

    public Post(int id, String title, Blob image, double raiseMoney, double goalMoney,int raisePeople,int goalPeople, String description) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.raiseMoney = raiseMoney;
        this.goalMoney = goalMoney;
        this.description = description;
        this.raisePeople = raisePeople;
        this.goalPeople = goalPeople;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRaiseMoney() {
        return raiseMoney;
    }

    public void setRaiseMoney(double raiseMoney) {
        this.raiseMoney = raiseMoney;
    }

    public double getGoalMoney() {
        return goalMoney;
    }

    public void setGoalMoney(double goalMoney) {
        this.goalMoney = goalMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public int getRaisePeople() {
        return raisePeople;
    }

    public void setRaisePeople(int raisePeople) {
        this.raisePeople = raisePeople;
    }

    public int getGoalPeople() {
        return goalPeople;
    }

    public void setGoalPeople(int goalPeople) {
        this.goalPeople = goalPeople;
    }

    @Override
    public String toString() {
        return "Post{" + "id=" + id + ", raiseMoney=" + raiseMoney + ", goalMoney=" + goalMoney + ", raisePeople=" + raisePeople + ", goalPeople=" + goalPeople + ", title=" + title + ", description=" + description + ", image=" + image + '}';
    }
}
