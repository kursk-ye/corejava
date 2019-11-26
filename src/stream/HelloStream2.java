package stream;

import static com.kursk.Util.println;

import java.math.BigInteger;
import java.util.stream.Stream;

public class HelloStream2
{
  public static void main(String[] args)
  {
    Stream<String> words = Stream.of("gently" , "down" , "the" ,"stream");

/*    Stream<Double> randoms = Stream.generate(Math::random);
    randoms.forEach(d -> println(d));*/

/*    Stream<String> echos = Stream.generate( () -> "echo");
    echos.forEach( w -> println(w));*/

    Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO , n -> n.add(BigInteger.ONE));
    integers.forEach( i -> println(i));


  }
}
