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

        // RedApple apple3 = new Apple();

        println(apple instanceof Apple );
        println(apple instanceof Fruit );

        println(apple2 instanceof RedApple );
        println(apple2 instanceof Apple );
        println(apple instanceof Fruit );

        println(apple.getClass().getName());
        println(apple2.getClass().getName());

        Apple apple4 = new Apple();
        apple4.eatFruit("orange");

        Fruit apple5 = new Apple();
        ((Apple) apple5).getApple();
        // apple5.getApple()  //error


    }
}
