package lambda;

import java.util.ArrayList;

import static com.kursk.Util.println;

public class TestNull {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList(5);

        list.add(12);
        list.add(null);
        list.add(13);
        list.add(null);
        list.add(14);

        println(list.toString());
        list.removeIf(e -> e == null );  // how to infer type of e is Integer  ?
        println(list.toString());
    }
}
