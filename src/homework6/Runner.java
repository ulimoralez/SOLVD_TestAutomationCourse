package homework6;

import homework6.classes.University;
import homework6.utils.CreatedObjects;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {

        //Using the class University wich has a LinkedHashSet - HashMap - TreeMap
        University university = new University(CreatedObjects.professor1, CreatedObjects.student1, CreatedObjects.student2,
                CreatedObjects.student3, CreatedObjects.student4, CreatedObjects.student5);

        university.addClass(new Date(), CreatedObjects.professor1, "Basic Git");
        university.addClass(new Date(), CreatedObjects.professor2, "Intermediate Git");
        university.addClass(new Date(), CreatedObjects.professor3, "Advance Git");
        university.addClass(new Date(), CreatedObjects.professor1, "Git workflows");

        university.addProfessor(CreatedObjects.professor1);
        university.addProfessor(CreatedObjects.professor2);
        university.addProfessor(CreatedObjects.professor3);
        university.addProfessor(CreatedObjects.professor4);
        university.addProfessor(CreatedObjects.professor5);

        university.addStudent(CreatedObjects.student1);
        university.addStudent(CreatedObjects.student2);
        university.addStudent(CreatedObjects.student3);
        university.addStudent(CreatedObjects.student4);
        university.addStudent(CreatedObjects.student5);

        university.removeStudent(CreatedObjects.student1);
        university.removeProfessor(CreatedObjects.professor2);

        System.out.println(university.getProfessorsList());
        System.out.println(university.getClassroom());
        System.out.println(university.getSchoolCalendar());
    }
}
