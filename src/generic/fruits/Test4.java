package generic.fruits;

import static com.kursk.Util.println;

public class Test4 {
    static void getApple(Apple a){
        println(a.toString());
    }

    static void getRedApple(RedApple ra){
        println(ra.toString());
    }

    public static void main(String[] args) {
        Fruit apple = new Apple(2);
        getApple((Apple) apple);

        Apple apple2 = new RedApple(3);
        getRedApple((RedApple) apple2);
    }
}
