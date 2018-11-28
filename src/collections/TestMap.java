package collections;

import java.util.HashMap;
import java.util.Map;

import static com.kursk.Util.println;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(1, 1);
        m.put(2, 2);
        m.put(3, null);

        println(m);

        m.merge(1, 10, (x, y) -> x + y);
        println(m);

        m.merge(2, 10, (x, y) -> x < y ? x : y);
        println(m);

        m.merge(2, 0, (x, y) -> x < y ? x : y);
        println(m);

        m.merge(3, 10, (x, y) -> x * y);
        println(m);

        m.merge(3, 2, (x, y) -> x * y);
        println(m);

        m.merge(4, 10, (x, y) -> y / x);
        println(m);

        m.merge(1, 10, (x, y) -> null);
        println(m); // remove
    }
}
