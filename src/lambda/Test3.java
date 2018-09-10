package lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


import static com.kursk.Util.println;

public class Test3 {
    public static void main(String[] args) {
        repeatMesg("hello" , 1000);
    }

    static void repeatMesg(String text, int delay){
        ActionListener listener = event ->
        {
            println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay , listener).start(

        );
    }
}
