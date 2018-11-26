package collections.concrete;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static com.kursk.Util.println;

public class TestLinkedList {
    public static void main(String[] args) {
        List<String> staff = new LinkedList<>();

        staff.add("01");
        staff.add("02");
        staff.add("03");
        staff.add("04");
        staff.add("05");

        ListIterator<String> iter = staff.listIterator();

        /*while (iter.hasNext()) println(iter.next());

        println("**********");

        while (iter.hasPrevious()) println(iter.previous());*/

        while (iter.hasNext()){
            if (iter.next() == "03") {
                /*iter.remove();
                iter.add("003");
                iter.add("004");
                iter.add("005");*/
                iter.set("003");
            }

        }

        println("**********");
        while (iter.hasPrevious()) println(iter.previous());
    }
}
