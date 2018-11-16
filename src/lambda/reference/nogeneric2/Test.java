package lambda.reference.nogeneric2;

public class Test  {

    public static void main(String[] args) {
        TestReference tr = new TestReference("yeyuzne");

        tr.callMethod(MethodProvider::helloProvider );
    }
}
