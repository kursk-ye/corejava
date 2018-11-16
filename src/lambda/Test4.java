package lambda;

import static com.kursk.Util.println;

public class Test4 {
    public static void main(String[] args) {
        repeat(10 , i -> {
            println("coundown " + i);
            //println(this.getClass().getName());
        } );
    }

    static void repeat(int n , IntConsumer2 action){
        for(int i = 0; i<n ; i++) action.accept(i);
    }
}

interface IntConsumer2 {
    void accept(int value);
}
