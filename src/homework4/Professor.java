package homework4;

import homework3.interfaces.IProfessor;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Professor extends Person implements IProfessor {

    private String studyArea;
    private String collegeName;
    public static Logger logger = Logger.getLogger(Professor.class.getName());
    public FileHandler fh;

    {
        try {
            fh = new FileHandler("src/homework4/readText/Logs.txt");
            logger.addHandler(fh);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
            logger.info("Hello! My name is: "+firstName);
        }catch (Exception e){
            logger.warning("Error in Professor->sayHello: "+e);
        }
    }

    @Override
    public void drink() {
        logger.info("I like to drink tea");
    }
    @Override
    public String themeToTeach() {
        return "Java OOP";
    }
}
