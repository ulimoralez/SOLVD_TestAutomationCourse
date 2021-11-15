package homework4;

import java.util.Scanner;
import java.util.logging.Logger;

public class runner {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(runner.class.getName());
        Scanner sc = new Scanner(System.in);
        //With a static method we change a value
        Person.addFavouriteFood("Pizza");
        Programmer.addFavouriteFood("Tacos");
        Child.addFavouriteFood("Falafel");
        Professor.addFavouriteFood("Salad");
        logger.info("Your Turn!");
        Student.addFavouriteFood(sc.nextLine());
    }
}
