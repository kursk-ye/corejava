package reflection;

import generic.fruits.Apple;
import generic.fruits.Fruit;
import generic.fruits.RedApple;

import java.lang.reflect.Constructor;

import static com.kursk.Util.println;

public class Test1 {

    public static void main(String[] args) {

        String s = "java.lang.String";
        try{
            Class c2 = Class.forName(s);
            String se = (String) c2.newInstance();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            Class c3 = Class.forName("generic.fruits.Apple");
            Constructor c = c3.getConstructor(new Class[]{double.class});
            Apple ap = (Apple) c.newInstance(20);
            //println("apple price: " + ap.getPrice());
            }catch(Exception e){
                    e.printStackTrace();
            }


        try{
            Apple a = new Apple();
            //Class cl = Class.forName("generic.fruits.Frut");
            println(Long[].class.getName());
            println(int[].class.getName());
        }catch(Exception e){
            System.out.println(e);
        }


    }
}
