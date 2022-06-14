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
    private String takePlace, description;

    public TimeLine(String takePlace, String description) {
        this.takePlace = takePlace;
        this.description = description;
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
        return "TimeLine{" + "takePlace=" + takePlace + ", description=" + description + '}';
    }
    
}
