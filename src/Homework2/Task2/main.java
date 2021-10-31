package Homework2.Task2;

import Homework2.Task2.Hierarchy.*;
public class main {
    public static void main(String[] args) {
        People people = new People("Ulises", "Moralez");
        People people1 = new People("Uli", "Moralez");

        Programmer programmer = new Programmer("Ulises","Moralez",1, "Java","Windows");
        Programmer programmer1 = new Programmer("Uli", "Moralez", 2, "Cobol", "MacOS");

        Student student = new Student("Ulises","Moralez", "UTN", "University Technician in Programming");
        Student student1 = new Student("Ulises", "Moralez", 21, "UTN", "IEM");


        System.out.println(people.toString());
        System.out.println(people.equals(people1));
        System.out.println(people.hashCode());

        System.out.println(programmer.toString());
        System.out.println(programmer.equals(programmer1));
        System.out.println(programmer.hashCode());


        student.toString();
        System.out.println(programmer.equals(student1));
        System.out.println(student1.hashCode());

    }
}
