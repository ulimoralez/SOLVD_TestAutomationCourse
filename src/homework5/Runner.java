package homework5;

public class Runner {
    public static void main(String[] args) {
        //Initialize the variables
        Person person = new Person();
        Child child = new Child();
        Professor professor = new Professor(1111);
        Programmer programmer = new Programmer();
        Student student = new Student();

        //Change the info
        person.changeInfo("Ulises","Moralez",21);
        child.changeInfo("Ulises", "Moralez", 21);
        professor.changeId(2222);
        programmer.changeInfo("Ulises", "Moralez", 90,"JavaScript","Fedora Linux");
        student.changeInfo("Ulises", "Moralez", "UTN", "Programming");
        student.studyHoursInADay(25);
    }
}
