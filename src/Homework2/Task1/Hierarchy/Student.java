package Homework2.Task1.Hierarchy;

public class Student extends People{
    private String collegeName;
    private String careerName;

    public Student(String firstName, String lastName, String gender, int age, String collegeName, String careerName) {
        super(firstName, lastName, gender, age);
        this.collegeName = collegeName;
        this.careerName = careerName;
    }

    public Student(String firstName, String lastName, int age, String collegeName, String careerName) {
        super(firstName, lastName, age);
        this.collegeName = collegeName;
        this.careerName = careerName;
    }

    public Student(String firstName, String lastName, String gender, String collegeName, String careerName) {
        super(firstName, lastName, gender);
        this.collegeName = collegeName;
        this.careerName = careerName;
    }

    public Student(String firstName, String lastName, String collegeName, String careerName) {
        super(firstName, lastName);
        this.collegeName = collegeName;
        this.careerName = careerName;
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
}
