package interfacess;

import generic.fruits.Apple;

import static com.kursk.Util.println;

public class GreenApple extends Apple {
    public void eatGreenApple(){
        println("I am eat a green apple!");
    }

    public static void main(String[] args) {
        Apple ap = new GreenApple();
        //ap.eatGreenApple()
    }
}
