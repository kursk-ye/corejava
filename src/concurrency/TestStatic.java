/*
    synchronized  block other thread that call other static method of same class
 */
package concurrency;

import lambda.Test;

import static com.kursk.Util.println;

public class TestStatic {

    public static void main(String[] args) {
        Runnable r1 = () -> {
          MethodGroup.method1();
        };

        Runnable r2 = () -> {
            MethodGroup.method2();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }

}

class MethodGroup
{
    public  static void method1()     // use synchronized to block
    {
        try{
            for(int i=0 ; i < 100; i++)
            {
                Thread.sleep(10);
                println( i + " method one is called");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized   static void method2()
    {
        try{
            for(int i=0 ; i < 100; i++)
            {
                Thread.sleep(10);
                println(i + " method two is called!!!!!!!!!!!!!!!!!");
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
