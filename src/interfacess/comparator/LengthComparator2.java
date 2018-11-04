package interfacess.comparator;

import generic.fruits.Fruit;

public class LengthComparator2 implements Kcomparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }

    @Override
    public Fruit getGenericValue(Fruit fruit) {
        return null;
    }

    public static void main(String[] args) {
        Fruit[] fa = { new Fruit(12.3) , new Fruit(15.4) };
        Fruit.sort(fa , new LengthComparator2());
    }
}
