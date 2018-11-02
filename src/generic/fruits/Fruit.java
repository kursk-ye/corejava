package generic.fruits;

import java.util.function.DoubleConsumer;

public class Fruit implements Comparable<Fruit> {
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private  double price;

    public Fruit(){

    }

    public Fruit(double price){
        this.price = price;
    }

    public Fruit(Double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "I am a Fruit !!";
    }

    public int compareTo(Fruit o) {
        if (getPrice() == o.getPrice()) return 0;
        if (getPrice() > o.getPrice() ) return 1;
        return -1;
    }
}



