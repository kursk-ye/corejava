package lambda.reference.generic;

import static com.kursk.Util.println;

public class MethodProvider2 {
    private String provider;

    public MethodProvider2(String provider)
    {
        this.provider = provider;
    }

    public void helloProvider() {
        println("Hello * 2 " + this.provider + " !")  ;
        // return "Hello ";
    }
}
