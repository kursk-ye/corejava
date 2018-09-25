package generic.fruits;

public class Apple extends Fruit {
    private  double price;

    public Apple(){
        super();
    }

    public Apple(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "I am an Apple !!";
    }


}
