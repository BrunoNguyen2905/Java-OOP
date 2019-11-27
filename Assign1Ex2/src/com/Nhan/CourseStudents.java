package com.Nhan;

public class CourseStudents {

    public static void main(String[] args) {

        // Reference variables for two Student objects
        Student s1, s2;
        // Object instantiation
        s1 = new Student();
        s2 = new Student();
        // Setting values of variables
        s1.setName("Ann River");
        s1.setGrade1(2.5);
        s1.setGrade2(3);
        s2.setName("Bill Hill");
        s2.setGrade1(4);
        s2.setGrade2(4.5);
        // Output
        System.out.println("Name  \t\tAverage");
        System.out.println(s1.getName() + "\t" + s1.average());
        System.out.println(s2.getName() + "\t" + s2.average());

        CourseStudents2 program = new CourseStudents2();
        program.process();

    } //End of main

} //End of CourseStudents
