package interfacess.callback;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.Timer;

import static com.kursk.Util.println;

public class TimerPrinter implements ActionListenerKursk {

    @Override
    public void actionPerformed(ActionEvent event) {
        println("at the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }

    public static void main(String[] args) {
        ActionListenerKursk listener = new TimerPrinter();
        Timer t = new Timer(10 , listener);
        t.start();
    }


}
