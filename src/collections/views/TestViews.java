package collections.views;

import java.util.ArrayList;
import java.util.List;

import static com.kursk.Util.println;

public class TestViews {
    public static void main(String[] args) {
        List staff = new ArrayList<String>();

        staff.add("k0");
        staff.add("k1");
        staff.add("k2");
        staff.add("k3");
        staff.add("k4");
        staff.add("k5");
        staff.add("k6");
        staff.add("k7");

        List<String > subStaff = staff.subList(2,7);

        println(subStaff);

        subStaff.clear();

        println(staff);

    }
}
