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
public class EvaluateVolunteer {
    private int userId, postId, hasEvaluate, point;
    private String comment;

    public EvaluateVolunteer(int userId, int postId, int hasEvaluate, String comment, int point) {
        this.userId = userId;
        this.postId = postId;
        this.hasEvaluate = hasEvaluate;
        this.point = point;
        this.comment = comment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getHasEvaluate() {
        return hasEvaluate;
    }

    public void setHasEvaluate(int hasEvaluate) {
        this.hasEvaluate = hasEvaluate;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "EvaluateVolunteer{" + "userId=" + userId + ", postId=" + postId + ", hasEvaluate=" + hasEvaluate + ", point=" + point + ", comment=" + comment + '}';
    }
}
