package homework4;

import homework3.interfaces.IHuman;
import homework3.interfaces.IProgrammer;

import java.util.Objects;

public class Programmer extends Person implements IProgrammer{
    private int yearsOfExperience;
    private String favoriteLanguage;
    private String favoriteOS;

    //Constructors
    public Programmer(String firstName, String lastName, String gender, int age, int yearsOfExperience, String favoriteLanguage, String favoriteOS) {
        super(firstName, lastName, gender, age);
        changeInfo(yearsOfExperience, favoriteLanguage, favoriteOS);
    }
    public Programmer(String firstName, String lastName, int age, int yearsOfExperience, String favoriteLanguage, String favoriteOS) {
        super(firstName, lastName, age);
        changeInfo(yearsOfExperience, favoriteLanguage, favoriteOS);
    }
    public Programmer(String firstName, String lastName, String gender, int yearsOfExperience, String favoriteLanguage, String favoriteOS) {
        super(firstName, lastName, gender);
        changeInfo(yearsOfExperience, favoriteLanguage, favoriteOS);
    }
    public Programmer(String firstName, String lastName, int yearsOfExperience, String favoriteLanguage, String favoriteOS) {
        super(firstName, lastName);
        changeInfo(yearsOfExperience, favoriteLanguage, favoriteOS);
    }

    //Getters and Setters
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }
    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
    public String getFavoriteOS() {
        return favoriteOS;
    }
    public void setFavoriteOS(String favoriteOS) {
        this.favoriteOS = favoriteOS;
    }

    //Methods and Functions
    public void changeInfo(int yearsOfExperience, String favoriteLanguage, String favoriteOS){
        this.yearsOfExperience = yearsOfExperience;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOS = favoriteOS;
    }
    public void changeInfo(String firstName, String lastName, int yearsOfExperience, String favoriteLanguage,
                           String favoriteOS){
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.yearsOfExperience = yearsOfExperience;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOS = favoriteOS;
    }

    //Overriding Object methods
    @Override
    public String toString() {
        return "Programmer{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", favoriteLanguage='" + favoriteLanguage + '\'' +
                ", favoriteOS='" + favoriteOS + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return yearsOfExperience == that.yearsOfExperience && Objects.equals(favoriteLanguage, that.favoriteLanguage) && Objects.equals(favoriteOS, that.favoriteOS);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearsOfExperience, favoriteLanguage, favoriteOS);
    }

    //Overriding interface methods
    @Override
    public void sayProgrammerQuote() {
        System.out.println("Work smarter not harder!");
    }
    @Override
    public void eat() {
        System.out.println("I like to eat vegetables!");
    }
    @Override
    public void drink() {
        System.out.println("I drink coffe!");
    }
}
