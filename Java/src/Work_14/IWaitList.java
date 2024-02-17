package Work_14;

import java.util.Collection;

public interface IWaitList <E>{
    void add(E elem);
    E remove();
    boolean contains(E elem);
    boolean containsAll(Collection<E> coll);
}
