package innerclass;

import static com.kursk.Util.println;

public class Test1 {
    public static void main(String[] args) {
        Object t = new Object(){};
        println(t.getClass());

        Person p = new Person("kursk"){
             public String getName()
             {
                 return this.name;
             }
        };
        println(p.getClass().getEnclosingClass());
        //println(p.getName());
    }
}

class Person{
    String name;

    Person(String name)
    {
        this.name = name;
    }

}
