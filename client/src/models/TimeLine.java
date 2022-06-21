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
public class TimeLine {
    private int id, hasDone;
    private String takePlace, description;

    public TimeLine(int id, String takePlace, String description, int hasDone) {
        this.takePlace = takePlace;
        this.description = description;
        this.id = id;
        this.hasDone = hasDone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHasDone() {
        return hasDone;
    }

    public void setHasDone(int hasDone) {
        this.hasDone = hasDone;
    }

    public String getTakePlace() {
        return takePlace;
    }

    public void setTakePlace(String takePlace) {
        this.takePlace = takePlace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "TimeLine{" + "id=" + id + ", hasDone=" + hasDone + ", takePlace=" + takePlace + ", description=" + description + '}';
    }

}
