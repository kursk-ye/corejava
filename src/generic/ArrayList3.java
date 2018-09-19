package generic;

import java.util.function.IntFunction;

public class ArrayList3<E> {
    private E[] elements;

    public E get(int n) {
        return (E)elements[n];
    }

    public void set(int n , E e){
        elements[n] = e;
    }

    /*public static <T extends Comparable> T[] minmax(T ... a){
        Object[] mm = new Object[2];
        return (Ts[])mm;
        return ArrayAlg.minmax(String[]::new , "Tom","Jack","Harry");
    }*/
}

class ArrayAlg{
    public static <T extends  Comparable> T[] minmax(IntFunction<T[]> constr, T... a){
        T[] mm = constr.apply(2);
        return mm;
    }
}


