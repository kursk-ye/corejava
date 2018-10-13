package reflection.java.lang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Scanner;

import static com.kursk.Util.print;
import static com.kursk.Util.println;

public class ReflectionTest {
    public static void main(String[] args) {
        String name;
        if(args.length > 0) name = args[0];
        else{
            Scanner in = new Scanner(System.in);
            println("Enter class name:");
            name = in.next();
        }

        try{
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            println(modifiers + " class " + name);
            if(supercl != null && supercl != Object.class) println(" extends " + supercl.getName());
            println("");
            printConstructors(cl);

        }catch(Exception e){
            e.printStackTrace();
        }


    }

    public static void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();

        for(Constructor c : constructors){
            String name = c.getName();
            println(" ");
            String modifiers = Modifier.toString(c.getModifiers());
            if(modifiers.length() > 0 )println(modifiers + " " + name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for(int j = 0; j < paramTypes.length; j++){
                if (j >  0) print(",");
                print(paramTypes[j].getName());
            }
            println(")");

        }
    }
}
