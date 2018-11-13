package lambda.reference.example;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static com.kursk.Util.println;

public class ArbitraryInstanceMethodReference {
    public static void main(String args[]) {
        Person p = new Person("kursk");
        println(p instanceof Consumer);

        final List<Person> people = Arrays.asList(new Person("dan"), new Person("laura"));
        // Method reference
        people.forEach(Person::printName);
        println("_________________________");
        // Lambda expression
        people.forEach(person -> person.printName());
        println("_________________________");
        // normal
        for (final Person person : people) {
            person.printName();
        }
    }


    private static class Person {
        private String name;
        public Person(final String name) {
            this.name = name;
        }
        public void printName() {
            System.out.println(name);
        }
    }
}
