package inheritance;

import generic.fruits.Apple;
import generic.fruits.Fruit;

import static com.kursk.Util.println;

public class Test1 {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;

        int ia = 100;
        int ib = 100;

        println( a == b);
        println( a.equals(b));

        println( ia == ib);

        println(Integer.toString( 17 ,16));
        println(Integer.valueOf( "111" ,2));

        println( a.getClass() );
        println( int.class );
        println( a.getClass() == int.class );
        println( a.getClass() == Integer.class );

        Class intClassObj = int.class;
        try{
            println(" ---  intClassObj.newInstance()  ---");
            intClassObj.newInstance();
            }catch(Exception e){
                    System.out.println(e);
            }


        println("-------------------------");

        Fruit f = new Apple();
        println( f.getClass() == Fruit.class );
        println( f.getClass() == Apple.class );
    }
}
