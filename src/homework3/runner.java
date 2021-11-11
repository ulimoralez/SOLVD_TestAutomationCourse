package homework3;

public class runner {
    public static void main(String[] args) {
        Person person = new Person("Ulises","Moralez");
        Programmer programmer = new Programmer("Ulises","Moralez",1, "Java", "Windows");
        Student student = new Student("Ulises", "Moralez", "UTN", "Programming");
        Professor professor = new Professor("Ulises", "Moralez","Programming");

        //All the classes shares an interface wich is IHuman, but every class implements in a different way
        person.drink();
        programmer.drink();
        student.drink();
        professor.drink();

        person.eat();
        programmer.eat();
        student.eat();
        professor.eat();
    }
}
