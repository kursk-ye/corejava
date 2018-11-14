package lambda.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("yelei1");
        names.add("yelei2");
        names.add("yelei3");
        names.add("yelei4");
        names.add("yelei5");

        /*Stream<Person> stream = names.stream().map(Person::new); // why can't resolve

        List<Person> people = stream.collect(Collectors.toList());
        Person[] people1 = stream.toArray(Person[]::new);*/
    }
}
