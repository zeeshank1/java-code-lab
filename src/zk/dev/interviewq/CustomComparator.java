package zk.dev.interviewq;

///*
//    Custom Comparator
//    Create a custom comparator using a lambda expression that sorts a list of Person objects by their age. Assume Person is a class with name and age fields.
//*/
//
//class Person {
//    String name;
//    int age;
//    // Constructor, getters, and setters
//}
//
//List<Person> people = Arrays.asList(
//    new Person("Alice", 30),
//    new Person("Bob", 25),
//    new Person("Charlie", 35)
//);
//

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {

    String name;
    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Constructor, getters, and setters
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomComparator {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        people.sort(( p1, p2)-> p2.getName().compareTo(p1.getName()) );
//        people.sort((p1,p2)-> Integer.compare(p2.getAge(), p1.getAge( )) );
//        people.sort(Comparator.comparing((Person p)-> p.getAge()).thenComparing(p->p.getName()));

        people.forEach(
            System.out::println
        );


    }
}
