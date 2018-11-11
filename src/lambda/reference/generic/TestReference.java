package lambda.reference.generic;


import java.util.function.Consumer;

public class TestReference {

    public <T> void  callMethod( T mp , Consumer<T> action) {
        action.accept(mp) ;
    }
}
