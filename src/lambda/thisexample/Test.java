package lambda.thisexample;


import javax.swing.*;

import static com.kursk.Util.println;

public class Test {
}

class Greeter
{
    public void greet()
    {
        println("hello , world");
    }
}

class TimedGreeter extends Greeter
{
    public void greet()
    {
        // Timer t = new Timer(1000 , super::greet); // why can't resovle
        //t.start();
    }
}