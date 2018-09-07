package generic;

public class ArrayList<E> {
    private Object[] elements;

    public E get(int n) {
        return (E) elements[n];
    }

    public void set(int n, E e) {
        elements[n] = e;
    }
}
