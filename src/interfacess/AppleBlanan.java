package interfacess;

import generic.fruits.Apple;

import static com.kursk.Util.println;

public class AppleBlanan extends Apple implements Blanan {
    @Override
    public void eatBlanan() {
        println(" appleBlanan is good eat");
    }

    public static void main(String[] args) {
        Apple ab =  new AppleBlanan();
        ab.eatApple();

        ((AppleBlanan)ab).eatBlanan();

    }

}
