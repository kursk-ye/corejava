package generic;

import generic.fruits.Fruit;
import generic.fruits.Apple;
import generic.fruits.RedApple;

import java.util.Arrays;

import static com.kursk.Util.println;

public class ArrayTest {

    <T extends Fruit> boolean compare(T a1 , T a2){
        return true;
    }

    public static void main(String[] args) {
        Apple[] aa = new Apple[3];
        Fruit[] fa = aa;
        // fa[0] = new Fruit(12.3);  // ArrayStoreException
        fa[0] = new Apple(12.3);
       // aa[1] = new Fruit(13.3);
        aa[1] = new RedApple(15.3);

        println(Arrays.toString(fa));

    }
}

