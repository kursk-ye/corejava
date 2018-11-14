package lambda.reference.nogeneric;

import java.util.function.Consumer;

public class TestReference {
    private MethodProvider mp ;

    TestReference(String name)
    {
        this.mp = new MethodProvider(name);
    }

    public void callMethod(Consumer<MethodProvider> action) {
       action.accept(this.mp ) ;
    }
}
