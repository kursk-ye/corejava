package generic.fruits;

import static com.kursk.Util.println;

public class Apple extends Fruit {
    public Apple(){
        super();
    }

    public Apple(double price){
        super(price);
    }

    @Override
    public String toString() {
        return "I am an Apple !!";
    }

    public void getApple(){
        println("get an Apple");
    }

}
