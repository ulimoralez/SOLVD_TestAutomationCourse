package homework4;

import homework3.interfaces.IHuman;
import homework3.interfaces.IPerson;

import java.util.Objects;

public class Person implements IPerson, IHuman {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    //Constructors
    public Person(){

    }
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }
    public Person(String firstName, String lastName, String gender) {
        this(firstName, lastName);
        this.gender = gender;
    }

    public Person(String firstName, String lastName, String gender, int age) {
        this(firstName, lastName, gender);
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Getter and Setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Methods and Functions
    public void changeInfo(String firstName, String lastName,String gender, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }
    public void changeInfo(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void changeInfo(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    //Overriding Object Methods
    @Override
    public String toString() {
        return "People{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, age);
    }

    //Overriding Methods of the interface
    @Override
    public void sayHello(String firstName) {
        System.out.println("Hello! My name is: "+firstName);
    }
    @Override
    public void eat() {
        System.out.println("I eat any type of food");
    }
    @Override
    public void drink() {
        System.out.println("I drink water");
    }
}
