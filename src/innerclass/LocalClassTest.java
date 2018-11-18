package innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import static com.kursk.Util.println;

public class LocalClassTest {

    public void start(int interval , boolean beep)
    {
        class TimePrinter implements ActionListener
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                println("At the tone , the time is " + new Date());
                    if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }

        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval , listener);
        t.start();
    }
}
