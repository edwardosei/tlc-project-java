package BasicJava;

import Abstract.Nameable;

import java.util.List;

public class Student implements Nameable {

   public String studentName;
    protected List<Double> studentGrades;

    public Student(List<Double> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public Student(List<Double> studentGrades, String studentName) {
        this.studentGrades = studentGrades;
        this.studentName = studentName;
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
        return null;
    }
}
