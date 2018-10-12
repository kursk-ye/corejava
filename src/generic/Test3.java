package generic;

public class Test3 {

    public static <T> Pair<T> makePair(Class<T> c) throws IllegalAccessException, InstantiationException {
        return new Pair<>(c.newInstance(), c.newInstance());
    }

/*    public static <T> Pair<T> makePair2(T c){
        return new Pair<>(new T() , new T());
    }*/

    public static void main(String[] args) {

    }
}
