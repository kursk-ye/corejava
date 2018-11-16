package lambda.constructor;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Person {
    private String s;

    Person(String s)
    {
        this.s = s;
    }

    public static void main(String[] args) {
        BiFunction<String, String, Locale> f = Locale::new;
        Locale loc = f.apply("en","UK");

        Function<String, Person> pSupplier = Person::new;
    }
}
