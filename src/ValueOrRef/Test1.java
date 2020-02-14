package ValueOrRef;

import static com.kursk.Util.println;

public class Test1 {
    public static void main(String[] args) {
        int i = 0;
        int j =i;
        i = 1;
        println(j);

        Integer a = 0;
        Integer b = a;
        a = 2;
        println(b);
    }
}
