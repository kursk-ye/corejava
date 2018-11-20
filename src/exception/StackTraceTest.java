package exception;

import java.util.Scanner;

import static com.kursk.Util.print;
import static com.kursk.Util.println;

public class StackTraceTest {
    public static int factorial(int n)
    {
        println("factorial(" + n + ");");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for(StackTraceElement f : frames)
            println(f);
        int r;
        if(n<=1) r = 1;
        else r = n * factorial(n-1);
        println("return " + r);
        return  r;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        print("Enter n: ");
        int n = in.nextInt();
        factorial(n);
    }
}
