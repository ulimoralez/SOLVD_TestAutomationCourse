package homework3;

import homework3.interfaces.IHuman;
import homework3.interfaces.IStudent;

import java.util.Objects;

public class Student extends Person implements IStudent, IHuman {
    private String collegeName;
    private String careerName;

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

    @Override
    public String themeToStudy() {
        return ("Java and Testing");
    }

    @Override
    public void eat() {
        System.out.println("I eat when I'm not sleeping");
    }

    @Override
    public void drink() {
        System.out.println("I love drink coffee");
    }


}
