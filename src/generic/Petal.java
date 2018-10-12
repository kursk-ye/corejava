package generic;

import java.util.ArrayList;
import java.util.Arrays;

import static com.kursk.Util.*;
import static java.lang.Math.pow;

public class Petal {
    private static final int petalSize = 5;
    private  ArrayList<Double> PowerList;

    Petal(){
        this.PowerList = new ArrayList<Double>(Arrays.asList(pow(1,petalSize) , pow(2,petalSize), pow(3,petalSize), pow(4,petalSize), pow(5,petalSize)));
    }

/*    public static void main(String[] args) {
        Petal p = new Petal();
        println( "powerList : " + p.PowerList);
        //getPetalNumber(p.PowerList , 5, 5 , 0.0);
        Double temp = p.PowerList.remove(2);
        println(p.PowerList);
        p.PowerList.add(2 , temp);
        println(p.PowerList);
    }*/

    /*public static void main(String[] args) {
        Petal p = new Petal();
        println( "powerList : " + p.PowerList);
        getPetalNumber(p.PowerList , petalSize );
    }*/

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 5 ; i>=1 ; i--){
            factorial(i , list);
        }
        println("list:"+list);
    }

    public static int factorial( int n , ArrayList<Integer> list){
        if ( n == 1){
            list.add(1);
            return  1;
        } else {
            list.add(n);
            return  n * factorial( n - 1 , list);
        }
    }

    /*public static Double getPetalNumber(ArrayList<Double> list , int time){

        if ( time == 0 ){
            return  0.0;
        } else {
            return  list.get(listIndex) * time + getPetalNumber(list , time - innerTime);
        }

    }*/
}
