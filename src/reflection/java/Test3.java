package reflection.java;

import generic.Employee;

import java.lang.reflect.Field;

import static com.kursk.Util.println;

public class Test3 {
    public static void main(String[] args) {
        Employee harry = new Employee("harry");
        Employee jack = new Employee("jack");

        Class cl1 = harry.getClass();
        Class cl2 = jack.getClass();

        try{
            Field f = cl1.getDeclaredField("name");
            f.setAccessible(true);
            Object o = f.get(jack);
            println(o);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
