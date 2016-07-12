package com.sample.domain;

public class Student {

    private String name;
    private String id;
    private Grade grade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                '}';
    }
}
