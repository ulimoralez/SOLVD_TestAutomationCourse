package homework3;

import homework3.interfaces.IHuman;

public final class Child extends Person implements IHuman {
    private final int age = 7;

    public Child(){

    }

    public Child(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void eat() {
        System.out.println("I like apples!");
    }

    @Override
    public void drink() {
        System.out.println("I drink orage juice!");
    }

    //Make a final method does not change anything because anyway this class can't be inherited
    final void sayHello(){
        System.out.println("Hellooooooo!");
    }
}
