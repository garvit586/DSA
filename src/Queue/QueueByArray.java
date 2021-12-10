package Queue;

public class QueueByArray {
    int[] arr;
    int front;
    int rear;

    public QueueByArray(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }
}
