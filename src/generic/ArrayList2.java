package generic;

import static com.kursk.Util.println;

public class ArrayList2<E> {
    private E[] elements;

    public ArrayList2(){
        elements = (E[])new Object[10];
    }

    public ArrayList2(E[] el){
        elements = el;
    }

    public void set(E e, int i){
        elements[i] = e;
    }

    public void add(E e){ elements[0] = e;}

    public E get(int i){
        return elements[i];
    }

    public static <T extends Comparable> T[] mimax(T... a){
        Object[] mm = new Object[2];
        return (T[]) mm;
    }

    public void display(){
        for(E e : this.elements) println(e.getClass());
    }


}
