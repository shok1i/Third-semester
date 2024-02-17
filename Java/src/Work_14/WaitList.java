package Work_14;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;
    WaitList(){this.content = new ConcurrentLinkedQueue<>();}
    WaitList(Collection<E> collection){
        this.content = new ConcurrentLinkedQueue<E>(collection);
    }
    public void add(E elem){
        this.content.add(elem);
    }
    public E remove(){
        return this.content.poll();
    }
    public boolean contains(E elem){
        return this.content.contains(elem);
    }
    public boolean containsAll(Collection<E> collection){
        return this.content.containsAll(collection);
    }
    @Override
    public String toString(){
        return this.content.toString();
    }
}
