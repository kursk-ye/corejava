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
            println(text);
            Toolkit.getDefaultToolkit().beep();
        };
        new Timer(delay , listener).start();
    }

    public static void main(String[] args) {
        Test1.repeatMessage("hello kursk" , 1000);
    }
}
