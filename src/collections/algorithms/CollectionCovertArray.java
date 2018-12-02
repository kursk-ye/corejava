package collections.algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static com.kursk.Util.println;

public class CollectionCovertArray {
    public static void main(String[] args) {
        //List staff = new LinkedList();
        Collection<String> staff = new ArrayList();

        staff.add("k0");
        staff.add("k1");
        staff.add("k2");
        staff.add("k3");
        staff.add("k4");
        staff.add("k5");
        staff.add("k6");
        staff.add("k7");

        String[] arr1 = staff.toArray(new String[0]);
        for(String e : arr1) println(e);

    }
}
