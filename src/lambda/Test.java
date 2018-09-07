package lambda;

import static com.kursk.Util.*;

import javax.swing.*;
import javax.swing.Timer;
import java.util.Arrays;
import java.util.Date;

public class Test
{
    public static void main(String[] args) {
        String[] plants = new String[]{"Mercury" , "Venus" , "Earth" , "Mars" , "Jupiter" , "Saturn" , "Uranus" , "Neptune"};
        println(Arrays.toString(plants));
        println("Sorted in dictionary order:");
        Arrays.sort(plants);
        println(Arrays.toString(plants));

        println("Sorted by length");
        Arrays.sort(plants , (first , second) -> first.length() - second.length());
        /*Object o = new Object();
        Arrays.sort(plants , o -> return true);*/
        println(Arrays.toString(plants));

        Timer t = new Timer(1000, event -> println("this time is " + new Date()));
        t.start();

        JOptionPane.showMessageDialog(null , "Quit program?");
        System.exit(0);
    }

}
