package homework4;

import homework3.interfaces.IProgrammer;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Programmer extends Person implements IProgrammer{
    private int yearsOfExperience;
    private String favoriteLanguage;
    private String favoriteOS;
    public static Logger logger = Logger.getLogger(Programmer.class.getName());
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
        if(yearsOfExperience > 70){
            throw new ArithmeticException("Impossible to set that quantity - Much more than human posibilities");
        }else {
            this.yearsOfExperience = yearsOfExperience;
        }
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
        try{
            super.setFirstName(firstName);
            super.setLastName(lastName);
            this.yearsOfExperience = yearsOfExperience;
            this.favoriteLanguage = favoriteLanguage;
            this.favoriteOS = favoriteOS;
        }catch (Exception e){
            logger.warning("Error in Programmer->ChangeInfo: "+e);
        }

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
        logger.info("Work smarter not harder!");
    }
    @Override
    public void eat() {
        logger.info("I like to eat vegetables!");
    }
    @Override
    public void drink() {
        logger.info("I drink coffe!");
    }
}
