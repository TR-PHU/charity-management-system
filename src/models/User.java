/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Blob;


public class User {
    private int id, gender,status;
    private String fullName, username, email,isAdmin;
    private Blob avatar;

    public User(int id, String fullName, String username, String email, int gender, String isAdmin, Blob avatar,int status) {
        this.id = id;
        this.gender = gender;
        this.status = status;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.isAdmin = isAdmin;
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", gender=" + gender + ", status=" + status + ", fullName=" + fullName + ", username=" + username + ", email=" + email + ", isAdmin=" + isAdmin + ", avatar=" + avatar + '}';
    }

    
}
