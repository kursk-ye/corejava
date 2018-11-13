package lambda.constructor;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

import static com.kursk.Util.println;

public class Array1 {
    public static void main(String[] args) {
        IntFunction<int[]> arrayCreator1 = size -> new int[size];
        int[] intArray1 = arrayCreator1.apply(5);
        println(Arrays.toString(intArray1));

        IntFunction<int[]> arrayCreator2 = int[]::new;
        int[] intArray2 = arrayCreator2.apply(5);
        println(Arrays.toString(intArray2));

        Function<Integer , int[]> arrayCreator3 = int[]::new;
        int[] intArray3 = arrayCreator3.apply(5);
        println(Arrays.toString(intArray3));

        IntFunction<int[][]> TwoDimArrayCreator  = int[][]::new;
        int[][] intArray = TwoDimArrayCreator.apply(5);
        // Creates an  int[5][]  array
        intArray[0] = new int[5];
        intArray[1] = new int[5];
        intArray[2] = new int[5];
        intArray[3] = new int[5];
        intArray[4] = new int[5];

        System.out.println(Arrays.deepToString(intArray));
    }
}
