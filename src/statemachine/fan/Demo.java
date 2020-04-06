package statemachine.fan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.kursk.Util.println;

public class Demo {
    public static void main(String[] args) {
        CeilingFanPullChain chain = new CeilingFanPullChain();
        while (true){
            println("Press ENTER");
            getLine();
            chain.pull();
        }
    }

    static String getLine(){
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
        String line = null;
        try{
            line = in.readLine();
        }catch (IOException ex){
            ex.printStackTrace();
        }

        return line;
    }
}
