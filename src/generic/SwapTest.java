package generic;

public class SwapTest {
    public static void swap(Pair<?> p){
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p){
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}
