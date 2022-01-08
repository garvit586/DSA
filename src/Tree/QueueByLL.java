package Tree;

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

    void enqueue(T element){
        Node2<T> newNode = new Node2<>(element);
        if(rear ==null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            size++;
        }
    }

    public T dequeue(){
        if (size== 0){
            System.out.println("underflow");
        }
        T temp = front.data;
        front = front.next;
        if(size == 1){
            rear = null;
        }
        return temp;
    }
}
