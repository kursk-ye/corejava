package lambda.reference.generic;

//import java.util.function.Consumer;

public class TestReference {

    public <T> void  callMethod( T mp , Consumer<T> action , String s) {
        action.accept(mp, s) ;
    }
}

interface Consumer<T>{
    void accept(T t , String s);

    boolean equals(Object o);
}
