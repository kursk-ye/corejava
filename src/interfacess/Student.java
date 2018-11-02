package interfacess;

import generic.fruits.Fruit;

import java.util.*;

public class Student implements List<Fruit>{

    @Override
    public void sort(Comparator<? super Fruit> c) {
        Object[] a = this.toArray();
        Arrays.sort(a, (Comparator) c);
        ListIterator<Fruit> i = this.listIterator();
        for (Object e : a) {
            i.next();
            i.set((Fruit) e);
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Fruit> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Fruit fruit) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Fruit> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Fruit> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Fruit get(int index) {
        return null;
    }

    @Override
    public Fruit set(int index, Fruit element) {
        return null;
    }

    @Override
    public void add(int index, Fruit element) {

    }

    @Override
    public Fruit remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Fruit> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Fruit> listIterator(int index) {
        return null;
    }

    @Override
    public List<Fruit> subList(int fromIndex, int toIndex) {
        return null;
    }
}
