package generic.fruits;

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


}
