package homework5.classes;

import homework3.interfaces.IStudent;
import homework5.exceptions.TooMuchStudyHours;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student extends Person implements IStudent{
    private String collegeName;
    private String careerName;
    public static Logger logger = Logger.getLogger(Student.class.getName());
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
    public Student(){

    }
    public Student(String firstName, String lastName, String gender, int age, String collegeName, String careerName) {
        this(firstName, lastName, gender, collegeName, careerName);
        super.setAge(age);
    }
    public Student(String firstName, String lastName, int age, String collegeName, String careerName) {
        super(firstName, lastName, age);
        changeInfo(collegeName, careerName);
    }
    public Student(String firstName, String lastName, String gender, String collegeName, String careerName) {
        super(firstName, lastName, gender);
        changeInfo(collegeName, careerName);
    }
    public Student(String firstName, String lastName, String collegeName, String careerName) {
        super(firstName, lastName);
        changeInfo(collegeName, careerName);
    }

    //Methods and Functions
    public void changeInfo(String collegeName, String careerName){
        this.collegeName = collegeName;
        this.careerName = careerName;
    }
    public void changeInfo(String firstName, String lastName, String collegeName, String careerName){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.collegeName = collegeName;
        this.careerName = careerName;
    }
    public void studyHoursInADay(int hours){
        if(hours > 24){
            throw new ArithmeticException("This is impossible, a day only have 24 hours");
        }else{
            if(hours > 15){
                throw new TooMuchStudyHours();
            }else{
                logger.info("Sounds great! Keep on it!");
            }
        }
    }

    //Overriding Object functions
    @Override
    public String toString() {
        return "Student{" +
                "collegeName='" + collegeName + '\'' +
                ", careerName='" + careerName + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(collegeName, student.collegeName) && Objects.equals(careerName, student.careerName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collegeName, careerName);
    }

    //Overriding interface methods
    @Override
    public String themeToStudy() {
        return ("Java and Testing");
    }
    @Override
    public void eat() {
        logger.info("I eat when I'm not sleeping");
    }
    @Override
    public void drink() {
        logger.info("I love drink coffee");
    }
}
