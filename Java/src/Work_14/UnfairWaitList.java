package Work_14;

public class UnfairWaitList <E> extends WaitList<E>{
    public UnfairWaitList() {}
    public void remove(E elem){ this.content.remove(elem);}
    public void moveToBack(E elem){
        if(this.content.remove(elem)){
            this.content.add(elem);
        }
    }
}
