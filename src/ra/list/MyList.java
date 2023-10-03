package ra.list;

import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {
    void add(E e);
    void add(int index, E e);


}
