package Queue;

public class QueueByLinkedList {
    Node front;
    Node rear;

    public QueueByLinkedList(){
        front =  null;
        rear = null;
    }

    public boolean isEmpty(){
        if (front == null){
            return true;
        }
        return false;
    }

    public void enqueue(Node newNode){
        if (isEmpty()){
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = rear.next;
        }
    }


}
