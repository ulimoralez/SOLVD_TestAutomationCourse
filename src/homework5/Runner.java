package homework5;

import homework4.runner;
import homework5.classes.*;
import homework5.customLinkedList.GenericLinkedList;

import java.util.*;
import java.util.logging.Logger;

public class Runner {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Runner.class.getName());

        //Initialize the variables
        Person person = new Person("Ulises","Moralez",21);
        Person person1 = new Person("Lionel","Messi",34);
        Person person2 = new Person("Kylie","Simpson",29);
        Person person3 = new Person("Michael","Jackson",21);
        Person person4 = new Person("Morgan","Freeman",21);

        Child child = new Child();

        Professor professor = new Professor(1111);
        Professor professor1 = new Professor("Ulises","Moralez", "UTN", "Programming");
        Professor professor2 = new Professor("Mozart","Ella", "Programming", "UTN");
        Professor professor3 = new Professor("Chopin","Nigth", "Data Science", "UTN");
        Professor professor4 = new Professor("Beeethoven","Music", "Biology", "UNNE");

        Programmer programmer = new Programmer();

        Student student = new Student();
        Student student1 = new Student("Ulises","Moralez", "UTN", "Programming");
        Student student2 = new Student("Stuart","Little", "UTN", "Programming");
        Student student3 = new Student("Pancha","Sky", "UTN", "Programming");
        Student student4 = new Student("Iron","Man", "UTN", "Programming");


        professor.changeInfo("Ulises", "Moralez");
        programmer.changeInfo("Ulises","Moralez", 1, "JavaScript","Linux Fedora");
        student.changeInfo("Ulises","Moralez", 21);

        //List -> ArrayList
        System.out.println("\n\nArrayList");
        ArrayList<Person> peopleList = new ArrayList<Person>();
        //Adding people in the arrayList
        peopleList.add(person);
        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        peopleList.add(person4);
        logger.info("PeolpleList to string: "+peopleList.toString());
        System.out.println("Get the size of peopleList: "+peopleList.size());
        System.out.println("Get the index 1 of peopleList "+peopleList.get(1));

        //Set -> SortedSet -> TreeSet
        System.out.println("\n\nTreeSet");
        SortedSet<String> countries = new TreeSet<String>();
        countries.add("India");
        countries.add("Argentina");
        countries.add("Sweden");
        countries.add("Mexico");
        countries.add("Argentina");
        logger.info("Countries with duplicate items: "+countries.toString());
        countries.remove("Argentina");
        logger.info("Countries after remove the duplicate item: "+countries.toString());
        countries.add("Argentina");
        countries.first();

        //Map -> LinkedHashMap
        System.out.println("\n\nLinkedHashMap");
        Map<String, Person> countryOfPeople = new LinkedHashMap<>();
        countryOfPeople.put("Argentina",peopleList.get(0));
        countryOfPeople.put("Belarus",peopleList.get(1));
        countryOfPeople.put("Spain",peopleList.get(2));
        System.out.println("Get a person from Argentina using countryOfPeople: "+countryOfPeople.get("Argentina"));
        System.out.println("Size of countryOfPeople: "+countryOfPeople.size());

        //Queue -> LinkedList
        System.out.println("\n\nQueue");
        Queue<Student> groupOfStudents = new LinkedList<>();
        groupOfStudents.offer(student1);
        groupOfStudents.offer(student3);
        groupOfStudents.offer(student2);
        groupOfStudents.offer(student4);
        System.out.println("For the FiFo, student1 will be removed: "+groupOfStudents.poll());
        System.out.println("Return the first element in the queue: "+groupOfStudents.peek());

        //List -> LinkedList
        System.out.println("\n\nLinkedList");
        LinkedList<Professor> groupOfProfessors = new LinkedList<>();
        groupOfProfessors.add(professor1);
        groupOfProfessors.add(professor2);
        groupOfProfessors.add(professor3);
        groupOfProfessors.add(professor4);
        System.out.println("Get the size of groupOfProffesors: "+groupOfProfessors.size());
        System.out.println("Get the first element in groupOfProffesors: "+groupOfProfessors.getFirst());
        System.out.println("Get the second element in groupOfProffesors: "+groupOfProfessors.get(1));

        //List -> GenericLinkedList
        System.out.println("\n\nGenericLinkedList");
        GenericLinkedList<String> beautifulNames = new GenericLinkedList<>();
        beautifulNames.insert(person1.getFirstName());
        beautifulNames.insert(person2.getFirstName());
        beautifulNames.insert(student2.getFirstName());
        beautifulNames.insert(professor2.getFirstName());
        System.out.println("Before deleting the 0 index: ");
        beautifulNames.show();
        beautifulNames.deleteAt(0);
        System.out.println("After deleting the 0 index: " );
        beautifulNames.show();
    }
}
