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
public class Donation {
    private int id;
    private double raiseMoney, goalMoney;
    private String title, description, timeLine, descriptionTimeLine;
    private Blob image;

    public Donation(int id, String title, Blob image, double raiseMoney, double goalMoney, String description, String timeLine, String descriptionTimeLine) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.raiseMoney = raiseMoney;
        this.goalMoney = goalMoney;
        this.description = description;
        this.timeLine = timeLine;
        this.descriptionTimeLine = descriptionTimeLine;
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

    public String getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(String timeLine) {
        this.timeLine = timeLine;
    }

    public String getDescriptionTimeLine() {
        return descriptionTimeLine;
    }

    public void setDescriptionTimeLine(String descriptionTimeLine) {
        this.descriptionTimeLine = descriptionTimeLine;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Donation{" + "id=" + id + ", title=" + title + ", raiseMoney=" + raiseMoney + ", goalMoney=" + goalMoney + ", description=" + description + ", timeLine=" + timeLine + ", descriptionTimeLine=" + descriptionTimeLine + ", image=" + image + '}';
    }
    
}
