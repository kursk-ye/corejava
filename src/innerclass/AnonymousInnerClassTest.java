package innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

import static com.kursk.Util.println;

public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        TalkingClock2 clock2 = new TalkingClock2();
        clock2.start(1000 , true);

        JOptionPane.showMessageDialog(null ,"Quit program?");
        System.exit(0);
    }
}

class TalkingClock2
{
    public void start(int interval , boolean beep)
    {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                println("At the tone, the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer t = new Timer(interval , listener);
        t.start();
    }
}
