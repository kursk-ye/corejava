package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.kursk.Util.println;

public class HelloStream3 {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("test1","test2","test3","test4");
        wordList.stream().filter( w -> w.length() > 3);
        wordList.stream().map(String::toUpperCase).forEach( w -> println(w));
        wordList.stream().map( s -> s.substring(0,4)).forEach( s -> println(s));

    }

    public static Stream<String> letters(String s)
    {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < s.length() ; i++)
        {
            result.add(s.substring(i , i+1));
        }
        return result.stream();
    }
}
