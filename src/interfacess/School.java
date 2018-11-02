package interfacess;

import static com.kursk.Util.println;

public class School implements Building {
    @Override
    public void build() {
        println("Building a school");
    }

    public static void main(String[] args) {
        School s = new School();
        s.build();
        s.purchase();
    }
}
