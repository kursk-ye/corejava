package lambda.reference.nogeneric2;


public class TestReference {
    private MethodProvider mp ;

    TestReference(String name)
    {
        this.mp = new MethodProvider(name);
    }

    public void callMethod(Consumer2<MethodProvider> action) {
       action.accept(this.mp , "haha" ) ;
    }
}
