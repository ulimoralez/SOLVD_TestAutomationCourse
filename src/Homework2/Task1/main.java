package Homework2.Task1;
/*
* We can replace these imports for a general import
* import Homework2.Task1.Hierarchy.*;
* */
import Homework2.Task1.Hierarchy.People;
import Homework2.Task1.Hierarchy.Programmer;
import Homework2.Task1.Hierarchy.Student;

public class main {
    public static void main(String[] args) {
        People people = new People("Ulises", "Moralez");
        Programmer programmer = new Programmer("Ulises","Moralez",1, "Java","Windows");
        Student student = new Student("Ulises","Moralez", "UTN", "University Technician in Programming");

        people.changeInfo("Ulises", "Moralez", "Male", 20);
        programmer.changeInfo(2, "JavaScript", "Linux");
        student.changeInfo("Harvard", "Computer Science");
    }
}
