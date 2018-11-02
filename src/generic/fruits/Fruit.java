package generic.fruits;

import java.util.function.DoubleConsumer;

public class Fruit implements Comparable<Fruit> {
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

    public int compareTo(Fruit o) {
        if (price == o.price) return 0;
        if (price > o.price ) return 1;
            return -1;
    }
}



