package stream;

import static com.kursk.Util.println;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class HelloStream
{
  public static void main(String[] args) throws IOException
  {
    String contents = new String(Files.readAllBytes(Paths.get("/media/yelei/all/download/technology-radar-vol-21-en.pdf")),
        StandardCharsets.UTF_8);
    List<String> words = Arrays.asList(contents.split("\\PL+"));

    println(words.stream().filter( w -> w.length() > 8  ).count());
    words.parallelStream().filter( w -> w.matches("Security")).forEach( w -> println(w));

  }
}
