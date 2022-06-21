/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author PHUTRAN
 */
public class PostVolunteer {
    private String title;
    private int id;
    private double goalPeople;
    public PostVolunteer(int id,String title, double goalPeople) {
        this.title = title;
        this.id = id;
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

    public double getGoalPeople() {
        return goalPeople;
    }

    public void setGoalPeople(double goalPeople) {
        this.goalPeople = goalPeople;
    }

    @Override
    public String toString() {
        return "PostVolunteer{" + "title=" + title + ", id=" + id + ", goalPeople=" + goalPeople + '}';
    }

   
}
