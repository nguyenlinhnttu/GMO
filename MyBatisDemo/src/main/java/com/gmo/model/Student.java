package com.gmo.model;

public class Student {
    private int id;
    private int mssv;
    private String fullName;
    private String className;
    private String email;
    public Student() {
        
    }
    public Student(int id, int mssv, String fullName, String className, String email) {
        super();
        this.id = id;
        this.mssv = mssv;
        this.fullName = fullName;
        this.className = className;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getMssv() {
        return mssv;
    }
    public void setMssv(int mssv) {
        this.mssv = mssv;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Student ID: "+ id +" Full Name: " + fullName +" Class: " + className +" Email: " + email;
    }
}
