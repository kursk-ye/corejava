package ScriptCompilingAnnotation;

import static com.kursk.Util.println;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptException;
import javax.swing.JButton;


public class TestScript {
  public static void main(String[] args) {
    ScriptEngineManager manager = new ScriptEngineManager();

    ScriptEngine engine = manager.getEngineByName("nashorn");

    ScriptEngine engine_js = manager.getEngineByExtension("js");

    try {
      engine_js.eval("n=1728");
      Object result =  engine_js.eval("n+20");
      println(result);
    } catch (ScriptException e) {
      e.printStackTrace();
    }


    try {
      engine_js.put("k", 200);
      Object result = engine_js.eval("k + 100");
      println(result);
    } catch (ScriptException e) {
      e.printStackTrace();
    }

    println("k:"+ engine_js.get("k") );

    Bindings scope = engine.createBindings();
    scope.put("b" , new JButton());
    try {
      engine_js.eval("b.text = 'OK' ",scope);
    } catch (ScriptException e) {
      e.printStackTrace();
    }

    StringWriter writer = new StringWriter();
    engine_js.getContext().setWriter( new PrintWriter(writer, true));


  }
}
