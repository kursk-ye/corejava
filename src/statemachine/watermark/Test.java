package statemachine.watermark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.kursk.Util.println;

public class Test {
  public static void main(String[] args) {
    //
        StreamContext ctx = new StreamContext();
      while (true){
          println("Press ENTER");
          getLine();
          ctx.nextState();
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
