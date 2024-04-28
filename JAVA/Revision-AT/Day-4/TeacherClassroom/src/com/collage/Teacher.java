package com.collage;

public class Teacher {
    private int teacherId;
    private String name;
    private Designation designation;

    public Teacher() {
    }

    public Teacher(int teacherId, String name, Designation designation) {
        this.teacherId = teacherId;
        this.name = name;
        this.designation = designation;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "TeacherId =" + teacherId +
                "\nname='" + name + '\'' +
                "\ndesignation=" + designation;
    }
}
