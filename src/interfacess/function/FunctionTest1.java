package interfacess.function;

import static com.kursk.Util.println;

public class FunctionTest1 {
    public static void add(int a, int b){
        while (b>0)
        {
            a++;
            b--;
        }
        println(a);
    }

    public static int  div(int a, int b){
        return (int)(a/(float)b);
    }

    public static void main(String[] args) {
        add(10,2);
        div(10,0);
    }
}
