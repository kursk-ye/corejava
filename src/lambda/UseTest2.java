package lambda;

import static com.kursk.Util.println;

public class UseTest2 {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
       println(t2.add2add( (int i, int j) -> {return i+j;} , 1, 2  )) ;
    }
}
