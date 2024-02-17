package Work_14;

public class BoundedWaitList <E> extends WaitList<E>{
    private final int capacity;
    BoundedWaitList(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public void add(E elem){
        if(this.content.size() < capacity){
            super.add(elem);
        }
    }

    @Override
    public String toString() {
        return this.content.toString() + ". Capacity: " + this.capacity;
    }
}
