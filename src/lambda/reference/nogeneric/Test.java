package lambda.reference.nogeneric;

public class Test  {

    public static void main(String[] args) {
        TestReference tr = new TestReference("yeyuzne");

        tr.callMethod(MethodProvider::helloProvider );
    }



}
