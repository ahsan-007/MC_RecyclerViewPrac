package com.example.mc_recyclerview_prac;

public class Student {
    String rollNo;
    String name;
    int imageId;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public Student(String rollNo, String name, int imageId) {
        this.rollNo = rollNo;
        this.name = name;
        this.imageId = imageId;
    }
}
