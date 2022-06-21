/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author PHUTRAN
 */
public class Donation {
    private int id;
    private String title;
    private double money;

    public Donation(int id,String title, double money) {
        this.id = id;
        this.title = title;
        this.money = money;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Donation{" + "id=" + id + ", title=" + title + ", money=" + money + '}';
    }
    
}
