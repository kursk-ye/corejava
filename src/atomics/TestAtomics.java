package atomics;

import java.util.concurrent.atomic.AtomicLong;

import static com.kursk.Util.println;

public class TestAtomics {
    public static void main(String[] args) {
        AtomicLong largest = new AtomicLong(10);
        println(largest);
        largest.accumulateAndGet(100,Math::max);
        println(largest);
    }
}
