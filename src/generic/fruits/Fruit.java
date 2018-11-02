package generic.fruits;

import java.util.function.DoubleConsumer;

import static com.kursk.Util.*;

public class Fruit {
    private  double price;

    public Fruit(){

    }

    public Fruit(Double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "I am a Fruit !!";
    }

    public final void eatFruit(String name){
        println( "eat " + name);
    }


}



