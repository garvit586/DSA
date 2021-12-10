package Queue;

public class QueueByLinkedList {
    Node front;
    Node rear;

    public QueueByLinkedList(){
        front =  null;
        rear = null;
    }

    public boolean isFull(){
        if (front == null){
            return true;
        }
        return false;
    }
}
