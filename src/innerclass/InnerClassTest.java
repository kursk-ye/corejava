package innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import static com.kursk.Util.println;

public class InnerClassTest {
    public static void main(String[] args) {
        new JFrame().setVisible(true);
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();
    }
}

class TalkingClock
{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval , boolean beep)
    {
        this.interval = interval;
        this.beep = beep;
    }

    public void start()
    {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval , listener);
        t.start();
    }


    public class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            println("at the tone , the time is " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}


