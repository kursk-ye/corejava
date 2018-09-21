package generic;

import generic.fruits.*;
import java.util.List;

public class Test3 {
    public static void main(String[] argss) {
        List<? super Apple> list = null;
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new RedApple());

    }

}

