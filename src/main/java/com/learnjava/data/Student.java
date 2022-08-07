package com.learnjava.data;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data


public class Student {

    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    List<String> activities = new ArrayList<>();
    private int noteBooks;

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noteBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noteBooks = noteBooks;
    }

    public Student() {
    }

    public Student(String s) {
        this.name = s;
    }

    public void printListOfActivities() {
        System.out.println(activities);
    }
}
