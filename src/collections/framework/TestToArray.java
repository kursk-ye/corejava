package collections.framework;

import java.util.ArrayList;

import static com.kursk.Util.println;

public class TestToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("o1");
        list.add("o2");
/*        list.add("o3");
        list.add("o4");
        list.add("o5");
        list.add("o6");*/

        String[]  strArr = {"s1","s2","s3","s4","s5"};

        String[] strArrNew = list.toArray(strArr);

        for(String s : strArrNew) println(s);

    }
}
