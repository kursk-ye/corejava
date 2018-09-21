package generic;

import java.util.function.Predicate;
import java.util.ArrayList;

import static com.kursk.Util.println;

public class Test2 {
    public static void printBuddies(Pair<? extends Employee>  p){
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        //p.setFirst(new Manager("kursk"));
        println(first.getName() + " and " + second.getName() + " are buddies.");
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result){
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for(int i = 1; i < a.length; i++){
            if (min.getBonus() > a[i].getBonus())  min = a[i];
            if (max.getBonus()  < a[i].getBonus())  max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    public static void main(String[] args) {
        printBuddies(new Pair<Employee>(new Employee("yelei") , new Employee("yeyunze")));
        printBuddies(new Pair<Manager>(new Manager("yelei") , new Manager("yeyunze")));

        Pair<Manager> managerBuddies = new Pair<>(new Manager("ceo"), new Manager("cfo"));

        Pair<? extends Employee> wildcardBuddies = null;
        //wildcardBuddies.setFirst(new Employee("kursk"));

        Pair<? super Employee> wildcardBuddies2 = null;
        wildcardBuddies2.setFirst(new Employee("kursk"));

        Manager ma[] = new Manager[5];
        ma[0] = new Manager("e1" , 10);
        ma[1] = new Manager("e2" , 6);
        ma[2] = new Manager("e3" , 12);
        ma[3] = new Manager("e4" , 2);
        ma[4] = new Manager("e5" , 7);

        Pair<Employee> result = new Pair<>();
        minmaxBonus(ma , result);
        println("min: " + result.getFirst().getName() + " max: " + result.getSecond().getName());

        ArrayList<Manager> ma2 = new ArrayList<>();
        ma2.set(0,ma[0]);
        ma2.set(1,ma[1]);
        ma2.set(2,ma[2]);
        ma2.set(3,ma[3]);
        ma2.set(4,ma[4]);
        Predicate<? super Manager> oddHashCode = obj -> obj.hashCode() %2 != 0;
        ma2.removeIf(oddHashCode);


    }
}
