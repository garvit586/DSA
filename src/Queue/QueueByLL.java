package Queue;

public class QueueByLL<T> {
    public T front;
    public T rear;

    public QueueByLL(){
        front =  null;
        rear = null;
    }

    public boolean isEmpty(){
        if (front == null){
            return true;
        }
        return false;
    }
}
