package stream;

import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static com.kursk.Util.println;

public class StreamCreation {
  public static void main(String[] args) {
    //
      String contents = "I have a happy famliy， me, two sun and my wife";
      String[] array = contents.split(" ");
      List<String> list = Arrays.asList(array);
      Stream<String> words  = Stream.of(array);

      Stream<String> words2 = Arrays.stream(array, 3, array.length);

      Stream<String> slience = Stream.empty();

      Stream<String> echos = Stream.generate(() -> "Echo");

      Stream<Double> randoms = Stream.generate(Math::random);

      Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));

      Stream<String> words3 = Pattern.compile(" ").splitAsStream(contents);

/*      Path path;

    try (Stream<String> lines = Files.lines(path)) {}*/


  }

}
