package com.turntabl;

import BasicJava.Lecture;
import BasicJava.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Double> grades1 = new ArrayList<>();
        grades1.add(56.00);
        grades1.add(56.00);
        grades1.add(70.00);
        grades1.add(78.00);
        Student student1 = new Student(grades1);

        ArrayList<Double> grades2 = new ArrayList<>();
        grades2.add(55.00);
        grades2.add(65.00);
        grades2.add(30.00);
        grades2.add(28.00);
        Student student2 = new Student(grades2);

        ArrayList<Double> grades3 = new ArrayList<>();
        grades3.add(45.00);
        grades3.add(22.00);
        grades3.add(15.00);
        grades3.add(90.00);
        Student student3 = new Student(grades3);

        ArrayList<Double> grades4 = new ArrayList<>();
        grades4.add(90.00);
        grades4.add(86.00);
        grades4.add(77.00);
        grades4.add(94.00);
        Student student4 = new Student(grades4);

        List<Student> listOfStudents=new ArrayList<>();

        Lecture lecture =new Lecture();
        lecture.enter(student1);
        lecture.enter(student2);
        lecture.enter(student3);
        lecture.enter(student4);

        System.out.println("The Highest Average Grade: " + lecture.getHighestAverageGrade());


    }
}
