package homework6.classes;

import homework6.customLogger.CustomLogger;

import java.io.IOException;
import java.util.*;

public class University {
    CustomLogger logger;

    {
        try {
            logger = new CustomLogger(University.class.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //The unique way to create it it's in the constructor
    private LinkedHashSet classroom = new LinkedHashSet();
    //Key = professorId
    private HashMap professorsList = new HashMap();
    //Key = date
    private TreeMap classDates = new TreeMap();

    public University(){

    }
    public University(Professor professor, Student student, Student student2, Student student3, Student student4,
                      Student student5){
        this.classroom.add(professor);
        this.classroom.add(student);
        this.classroom.add(student2);
        this.classroom.add(student3);
        this.classroom.add(student4);
        this.classroom.add(student5);
    }

    //Adders
    public void addProfessor(Professor professor){
        this.professorsList.put(professor.getId(), professor);
    }

    public void addStudent(Student student){
        this.classroom.add(student);
    }

    public void addClass(Date date, Professor professor, String theme){
        classDates.put(date,
                "\nProfessor "+professor.getFirstName()+" "+professor.getLastName()+" it's explainig: "+theme);
    }

    //Remove
    public void removeStudent(Student student){
        this.classroom.remove(student);
    }

    public void removeProfessor(Professor professor){
        professorsList.remove(professor);
    }

    //Getters
    public String getProfessorsList(){
        return this.professorsList.toString();
    }

    public String getSchoolCalendar(){
        return this.classDates.toString();
    }

    public String getClassroom(){
        return this.classroom.toString();
    }
}
