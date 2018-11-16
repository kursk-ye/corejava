package lambda;

import java.util.stream.Stream;

import static com.kursk.Util.println;

public class Test5 {
    String text;


    public static void main(String[] args) {
        Test5 t = new Test5();
        t.display(10 , x -> { return  (x + "!!!"); } , "my world is nice");
    }

    void display(int n , MyAction action , String text){
        for(int i=0 ; i<n ; i++)   println(action.doMyJob(text));
    }
}

interface MyAction {
    String doMyJob(String text);
}
