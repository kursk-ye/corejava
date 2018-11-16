package lambda.reference.nogeneric2;

import static com.kursk.Util.println;

public class MethodProvider {
    private String provider;

    MethodProvider(String provider)
    {
        this.provider = provider;
    }

    public void helloProvider(String text) {
        println("Hello " + this.provider + " " + text + " !")  ;
        // return "Hello ";
    }
}
