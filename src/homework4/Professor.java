package homework4;

import homework3.interfaces.IProfessor;

public class Professor extends Person implements IProfessor {

    private String studyArea;
    private String collegeName;

    //Constructors
    public Professor() {
    }
    public Professor(String firstName, String lastName, String studyArea, String collegeName) {
        this(firstName, lastName, studyArea);
        this.collegeName = collegeName;
    }
    public Professor(String firstName, String lastName, String gender, int age, String studyArea, String collegeName) {
        this(firstName, lastName, studyArea);
        super.setAge(age);
        super.setGender(gender);
        this.collegeName = collegeName;
    }
    public Professor(String firstName, String lastName, String studyArea) {
        super(firstName, lastName);
        this.studyArea = studyArea;
    }

    //Overriding interface and super class methods

    @Override
    public void sayHello(String firstName) {
        try {
            System.out.println("Hello! My name is: "+firstName);
        }catch (Exception e){
            System.out.println("Error in Professor->sayHello: "+e);
        }
    }

    @Override
    public void drink() {
        System.out.println("I like to drink tea");
    }
    @Override
    public String themeToTeach() {
        return "Java OOP";
    }
}
