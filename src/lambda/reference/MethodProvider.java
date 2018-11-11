package lambda.reference;

import static com.kursk.Util.println;

public class MethodProvider {
    private String provider;

    MethodProvider(String provider)
    {
        this.provider = provider;
    }

    public void helloProvider() {
        println("Hello " + this.provider + " !")  ;
        // return "Hello ";
    }
}
