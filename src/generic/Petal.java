package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static com.kursk.Util.*;
import static java.lang.Math.pow;

public class Petal {
    private static final int petalSize = 5;
    private  ArrayList<Double> PowerList;

    Petal(){
        this.PowerList = new ArrayList<Double>(Arrays.asList(pow(1,petalSize) , pow(2,petalSize), pow(3,petalSize), pow(4,petalSize), pow(5,petalSize)));
    }

    public static void main(String[] args) {
        int result = 0;
        Scanner z = new Scanner(System.in);
        int n = z.nextInt();
        for (int i = 2; i < Math.pow(10,n+1)-1; i++) {
            int sum = 0;
            int number = i;
            while (number > 0) {
                int d = number % 10;
                number /= 10;

                int temp = d;
                for(int j = 1; j < n; j++){
                    temp *= d;
                }
                sum += temp;
            }

            if (sum == i) {
                result += i;
            }
        }
        System.out.println(result);
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


    /*
    a           0 - 9 的次方
    time        a出现的次数
    depth       递归的深度
     */
    /*public static Double getRecursionResult(Double  a, int time , int depth){

        if ( depth == 0 ){
            return  0.0;
        } else {
            return  a * time + getRecursionResult(list , time - innerTime);
        }
    }*/
}
