package com.turntabl.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    private List<Student> students = new ArrayList<>();

    public void enter(Student student) {

        this.students.add(student);

    }

    public double getHighestAverageGrade() {

        double highestAverageGrade = 0;

        double averageGrade = 0;

        for (int i = 0; i < students.size(); i++) {

            averageGrade = students.get(i).getAverageGrade();

            if (averageGrade > highestAverageGrade)
                highestAverageGrade = averageGrade;

        }

        return highestAverageGrade;
    }



//    One-To-Many Relationship between Lecture and Student
//    A lecture contains multiple students
//    Students can have many lectures
}
