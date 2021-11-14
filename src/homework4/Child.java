package homework4;

import homework3.interfaces.IHuman;

public final class Child extends Person implements IHuman {
    static{
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
        System.out.println("Hellooooooo!");
    }
    public static void sayFAvouriteGame(){
        System.out.println("My favourite game is Minecraft");
    }

    //Overriding interface functions
    @Override
    public void eat() {
        System.out.println("I like apples!");
    }
    @Override
    public void drink() {
        System.out.println("I drink orage juice!");
    }
}
