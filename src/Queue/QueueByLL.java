package Queue;

public class QueueByLL<T> {
    private Node2<T> front;
    private Node2<T> rear;
    private int size;

    public QueueByLL(){
        front =  null;
        rear = null;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }


}
