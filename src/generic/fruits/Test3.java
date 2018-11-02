package generic.fruits;

import generic.ArrayList2;

import java.util.ArrayList;
import java.util.List;
import static com.kursk.Util.*;

public class Test3 {
    public static void main(String[] argss) {
        ArrayList2<? super Apple> list = new ArrayList2<>(new Fruit[10]);
        //list.add(new Fruit());
        list.add(new Apple(3));
        list.add(new RedApple(6));

        list.display();

    }

}

