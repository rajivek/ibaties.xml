package com.sample.domain;

import java.util.ArrayList;
import java.util.List;

public class Grade {

    private String name;
    private String division;
    private List<Student> students;

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", division='" + division + '\'' +
                ", students=" + students +
                '}';
    }
}
