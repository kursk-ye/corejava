package lambda.reference.generic;


public class Test {

    public static void main(String[] args) {
        TestReference tr = new TestReference();
        MethodProvider mp = new MethodProvider("yerunyang");
        MethodProvider2 mp2 = new MethodProvider2("yeyunze");

        tr.callMethod(mp , MethodProvider::helloProvider );
        tr.callMethod(mp2 , MethodProvider2::helloProvider );
    }



}
