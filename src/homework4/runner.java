package homework4;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //With a static method we change a value
        Person.addFavouriteFood("Pizza");
        Programmer.addFavouriteFood("Tacos");
        Child.addFavouriteFood("Falafel");
        Professor.addFavouriteFood("Salad");
        System.out.println("Your Turn!");
        Student.addFavouriteFood(sc.nextLine());
    }
}
