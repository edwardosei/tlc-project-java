package com.turntabl.BasicJava;

import java.util.List;

public class Student {

    protected List<Double> studentGrades;

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public double getAverageGrade() {

        double total = 0;

        for (int i = 0; i < studentGrades.size(); i++) {

            total += studentGrades.get(i);

        }

        double averageGrade = total / studentGrades.size();

        return averageGrade;

    }
}
