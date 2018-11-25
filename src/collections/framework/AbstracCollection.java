package collections.framework;

import java.util.Collection;
import java.util.Iterator;

public abstract class AbstracCollection<E> implements Collection<E> {

    public abstract Iterator<E> iterator();
}
