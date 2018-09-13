package generic;

import java.util.logging.Logger;

public class Test {
    public static <T extends Throwable> void doWork(Class<T> t){
/*        try{

        }catch (T e){
            Logger.global.info("generic throw");
        }*/
    }
}
