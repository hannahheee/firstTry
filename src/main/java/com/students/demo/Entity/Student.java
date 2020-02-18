package com.students.demo.Entity;

public class Student{


    private String name;
    private int id;



    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public  int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}