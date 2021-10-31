package Homework2.Task1.Hierarchy;

public class Programmer extends People{
    private int yearsOfExperience;
    private String favoriteLanguage;
    private String favoriteOS;

    public Programmer(String firstName, String lastName, String gender, int age, int yearsOfExperience, String favoriteLanguage, String favoriteOS) {
        super(firstName, lastName, gender, age);
        this.yearsOfExperience = yearsOfExperience;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOS = favoriteOS;
    }

    public Programmer(String firstName, String lastName, int age, int yearsOfExperience, String favoriteLanguage, String favoriteOS) {
        super(firstName, lastName, age);
        this.yearsOfExperience = yearsOfExperience;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOS = favoriteOS;
    }

    public Programmer(String firstName, String lastName, String gender, int yearsOfExperience, String favoriteLanguage, String favoriteOS) {
        super(firstName, lastName, gender);
        this.yearsOfExperience = yearsOfExperience;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOS = favoriteOS;
    }

    public Programmer(String firstName, String lastName, int yearsOfExperience, String favoriteLanguage, String favoriteOS) {
        super(firstName, lastName);
        this.yearsOfExperience = yearsOfExperience;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOS = favoriteOS;
    }

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
}
