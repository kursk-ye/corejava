package lambda.reference.generic;

import static com.kursk.Util.println;

public class MethodProvider {
    private String provider;

   public MethodProvider(String provider)
    {
        this.provider = provider;
    }

    public void helloProvider(String s) {
        println("Hello " + this.provider + s +" !")  ;
        // return "Hello ";
    }
}
