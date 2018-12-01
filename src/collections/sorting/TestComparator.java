package collections.sorting;

import java.io.Serializable;
//import java.util.Comparator;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.ToIntFunction;

public interface TestComparator<T> extends Comparator<T> {
    int compare(T o1, T o2);

    public static <T> TestComparator<T> comparingInt(ToIntFunction<? super T> keyExtractor) {
        //Objects.requireNonNull(keyExtractor);
        return (TestComparator<T> & Serializable)
                (c1, c2) -> Integer.compare(keyExtractor.applyAsInt(c1), keyExtractor.applyAsInt(c2));
    }
}
