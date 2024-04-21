package com.collage;

public class Classroom {

    private int roomId;
    private String name;

    private Teacher teacher;

    public Classroom() {
    }

    public Classroom(int roomId, String name, Teacher teacher) {
        this.roomId = roomId;
        this.name = name;
        this.teacher = teacher;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classroom = " +
                "\nRoomId=" + roomId +
                "\nName ='" + name + '\'' +
                "\n" + teacher;
    }
}
