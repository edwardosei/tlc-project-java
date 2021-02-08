package BasicJava;

import AbstractTypes.Nameable;

import java.util.List;

public class Student implements Nameable {

    protected List<Double> studentGrades;
    protected String name;

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

    @Override
    public String getName() {
        return this.name;
    }
}
