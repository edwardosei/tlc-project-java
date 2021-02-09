package com.turntabl.Inheritance;

import com.turntabl.BasicJava.Student;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(List<Double> studentGrades) {
        super(studentGrades);
    }

    public double hack() {
        double trueAverageGrade = this.getAverageGrade();
        double increase = trueAverageGrade * 0.1;
        double falseAverageGrade = trueAverageGrade + increase;
        return falseAverageGrade;
    }
}
