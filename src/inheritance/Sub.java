package inheritance;

public class Sub extends Super {
    int x = 200;

    // The constructors of the Sub class, either with-argument or no-argument,
    // will call the no-argument Super constructor. Since compiler tries to insert super() to
    // the 2 constructors in the Sub class, but the Super's default constructor is not defined, compiler reports the error message.
    public Sub(String s) {

    }

    public Sub(){
        System.out.println("sub");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}
