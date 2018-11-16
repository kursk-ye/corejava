package lambda.scope;

import lambda.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static com.kursk.Util.println;

public class Test1 {

    public static void repeatMessage(String text , int delay)
    {
        ActionListener listener = event ->
        {
            for(int i=0; i<10; i++)
            {
                println(i + " " + text);
                Toolkit.getDefaultToolkit().beep();
            }
        };
        new Timer(delay , listener).start();
    }

    public static void main(String[] args) {
        new JFrame().setVisible(true);
        Test1.repeatMessage("hello kursk" , 1000);

    }
}
