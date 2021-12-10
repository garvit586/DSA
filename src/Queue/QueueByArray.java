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

    public boolean isFull(){
        if (rear == arr.length - 1){
            return true;
        }
        return false;
    }

    public void enqueue(int value){
        if (isFull()){
            System.out.println("overflow");
        }
        else if(isEmpty()){
            front ++;
            rear ++;
            arr[rear] = value;
        }
        else{
            rear ++;
            arr[rear] = value;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("UnderFlow");
        }
        else{
            System.out.println("The deleted value is " + arr[front]);
            front++;
        }
        if (front > rear){
            front = rear = -1;
        }
    }
}
