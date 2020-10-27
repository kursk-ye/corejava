package stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static com.kursk.Util.println;

public class Test1 {
  public static void main(String[] args) throws IOException {
    //
      String contents = new String(Files.readAllBytes(Paths.get("D:\\Download\\temp.txt")), StandardCharsets.UTF_8);
      List<String> words = Arrays.asList(contents.split("\\PL+"));

      long count = 0;
      for(String w : words)
      {
          if(w.length() > 12 ) count++;
      }

      println("count:"+count);

      long count2 = words.parallelStream().filter( w -> w.length() > 12).count();
      println("count2:"+count2);

  }
}
