package generic;

import static com.kursk.Util.println;

public class Home {
    public static void main(String[] args) {
        Child c = new Child();
        Father f = (Father) new Child();
        println(c.add(1,2));
        println(f.add(1,2));
    }
}

class Father{
     int add(int a, int b){
        return  a+b;
    }
}

class Child extends Father{
     int add(int a, int b){
         return a+b*2;
     }
}
