package lambda.reference.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author imssbora
 */
public class MethodReferenceExample3 {

    public static void main(String[] args) {
        List<String> weeks = new ArrayList<>();
        weeks.add("Monday");
        weeks.add("Tuesday");
        weeks.add("Wednesday");
        weeks.add("Thursday");
        weeks.add("Friday");
        weeks.add("Saturday");
        weeks.add("Sunday");

        System.out.println("--------------Using lambda expression-----------------");
        weeks.stream().map((s)-> s.toUpperCase())
                .forEach((s)->System.out.println(s));

        System.out.println("--------------Using method reference-----------------");
        weeks.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
