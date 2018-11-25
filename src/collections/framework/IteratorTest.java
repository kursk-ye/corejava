package collections.framework;

import java.util.ArrayList;
import java.util.Iterator;

import static com.kursk.Util.println;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("yelei");
        list.add("yechaoyan");
        list.add("xushilan");
        list.add("yeyunze");
        list.add("yerunyang");

        Iterator<String> i = list.iterator();
        for(String s : list) println(s);

        println("*********************");

        while (true){
            if (i.next() == "xushilan") {
                i.remove();
                break;
            }

        }

        /*String s = i.next();
        i.remove();*/
        /*s = s + "1";
        list.add(s);*/

        for(String s1 : list) println(s1);

    }
}
