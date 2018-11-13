package lambda.scope;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static com.kursk.Util.println;


public class MyTask extends TimerTask
{
    private String name;

    public MyTask(String name)
    {
        this.name = name;
    }

    public void run() {
        println(Thread.currentThread() + " executing " + this.name + " [" + new Date() + "]");
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule( new MyTask("kursk") , new Date( new Date().getTime() + 5000));
    }
}
