package lambda;

import static com.kursk.Util.println;

public class Test4 {
    public static void main(String[] args) {
        repeat(1000 , i -> {
            println("coundown " + i);
        } );
    }

    static void repeat(int n , IntConsumer action){
        for(int i = 0; i<n ; i++) action.accept(i);
    }
}

interface IntConsumer {
    void accept(int value);
}
