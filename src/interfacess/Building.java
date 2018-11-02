package interfacess;

import static com.kursk.Util.println;

public interface Building {
    void build();

    default void purchase(){
        println("purchase " + this.getClass());
    }

}
