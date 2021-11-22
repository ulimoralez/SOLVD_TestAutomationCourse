package homework6.classes;

import homework3.interfaces.IHuman;
import homework5.exceptions.InvalidPersonAge;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Child extends Person implements IHuman {

    public static Logger logger = Logger.getLogger(Child.class.getName());
    private static FileHandler fh;
    static{
        try {
            fh = new FileHandler("src/homework4/readText/Logs.txt");
            logger.addHandler(fh);
            logger.setLevel(Level.ALL);
        } catch (IOException e) {
            e.printStackTrace();
        }
        final int childAge = 7;
        String favouriteFood = "Pizza";
    }
    public static String FAVOURITE_DRINK = "Grape Juice";

    //Constructors
    public Child(){

    }
    public Child(String firstName, String lastName) {
        super(firstName, lastName);
    }
    //Methods and functions
    //Make a final method does not change anything because anyway this class can't be inherited
    final void sayHello(){
        logger.info("Helloooo!");
    }
    public static void sayFAvouriteGame(){
        logger.info("My favourite game is Minecraft");
    }

    //Overriding interface functions

    @Override
    public void changeInfo(String firstName, String lastName, int age) {
        super.changeInfo(firstName, lastName);
        if(age < 0 || age > 18){
            throw new InvalidPersonAge();
        }
    }

    @Override
    public void eat() {
        logger.info("I like: "+favouriteFood);
    }
    @Override
    public void drink() {
        logger.info("I drink: "+FAVOURITE_DRINK);
    }
}
