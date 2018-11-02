package generic.fruits;

import java.lang.reflect.Field;

import static com.kursk.Util.println;

public class Apple extends Fruit {

    public Apple(double price){
        super(price);
    }

    public Apple(){
        super();
    }

    @Override
    public String toString() {
        return "I am an Apple !!";
    }

    public void eatApple(){
        println(this.toString());
    }

    public int compareTo(Apple o) {
        if ( o instanceof  Apple) return super.compareTo(o);
        return -2;
    }

    public static void main(String[] args) {
        Apple o = new Apple(12);
        Apple o2 = new Apple(15);
        o.compareTo(o2);

        println( o  instanceof Fruit);
        println( o  instanceof Comparable);
    }
}
