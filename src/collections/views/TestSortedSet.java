package collections.views;

import java.util.SortedSet;
import java.util.TreeSet;

import static com.kursk.Util.println;

public class TestSortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<>();

        // Adding Element to SortedSet
        s.add(1);
        s.add(7);
        s.add(2);
        s.add(3);
        s.add(9);
        s.add(4);

        println( s.subSet(2,9));
    }
}
