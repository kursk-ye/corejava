package reflection;

import generic.fruits.Apple;
import generic.fruits.Fruit;

import static com.kursk.Util.println;

public class Test2 {
    public static void main(String[] args) {
        Fruit f = new Apple();
        Class cl = f.getClass();
        println(cl.getName()); // generic.fruits.Apple ,why?
    }
}
