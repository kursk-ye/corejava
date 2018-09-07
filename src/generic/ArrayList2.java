package generic;

import static com.kursk.Util.println;

public class ArrayList2<E> {
    private E[] elements;

    public ArrayList2(){
        elements = (E[])new Object[10];
    }

    public void set(E e, int i){
        elements[i] = e;
    }

    public E get(int i){
        return elements[i];
    }

    public static <T extends Comparable> T[] mimax(T... a){
        Object[] mm = new Object[2];
        return (T[]) mm;
    }


}
