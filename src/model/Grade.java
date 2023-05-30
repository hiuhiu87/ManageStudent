/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Grade {
    private String id;
    private String studentCode;
    private float engScore;
    private float itScore;
    private float sportScore;
    private float avgScore; 

    public Grade(String studentCode, float engScore, float itScore, float sportScore) {
        this.studentCode = studentCode;
        this.engScore = engScore;
        this.itScore = itScore;
        this.sportScore = sportScore;
    }

    public Grade(float engScore, float itScore, float sportScore) {
        this.engScore = engScore;
        this.itScore = itScore;
        this.sportScore = sportScore;
    }


    public Grade() {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public float getEngScore() {
        return engScore;
    }

    public void setEngScore(float engScore) {
        this.engScore = engScore;
    }

    public float getItScore() {
        return itScore;
    }

    public void setItScore(float itScore) {
        this.itScore = itScore;
    }

    public float getSportScore() {
        return sportScore;
    }

    public void setSportScore(float sportScore) {
        this.sportScore = sportScore;
    }

    public float getAvgScore() {
        float avg = (engScore + itScore + sportScore) / 3;
        return (float) (Math.round(avg * 100.0) / 100.0);
    }
    
}
