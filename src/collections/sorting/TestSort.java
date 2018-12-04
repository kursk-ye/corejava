package collections.sorting;

import generic.Employee;

import java.util.*;

import static com.kursk.Util.println;

public class TestSort {

    public static void main(String[] args) {
        List<String> staff = new LinkedList<>();

        staff.add("zbaobao");
        staff.add("yelei");
        staff.add("ruanjing");
        staff.add("xiaoai");

        println(staff);
        Collections.sort(staff);
        println(staff);

        List<Employee> staff2 = new LinkedList<>();

        staff2.add(new Employee("yelei",200));
        staff2.add(new Employee("yeyunze",3000));
        staff2.add(new Employee("ruanjing",50));
        staff2.add(new Employee("xushilan",610));

        println(staff2);
        staff2.sort(Comparator.comparingInt(Employee::getBonus));
        println(staff2);
        println("********************");

        List<Employee> staff3 = new LinkedList<>();

        staff3.add(new Employee("yelei",200));
        staff3.add(new Employee("yeyunze",3000));
        staff3.add(new Employee("ruanjing",50));
        staff3.add(new Employee("xushilan",610));

        println(staff3);
        staff3.sort(TestComparator.comparingInt(Employee::getBonus));
        println(staff3);

        println("********************");

        staff3.sort(Comparator.reverseOrder());


    }
}
