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

    public void print(){
        if (front == -1){
            System.out.println("underflow");
        }
        else {
            int temp = front;
            while (temp <= rear) {
                System.out.print(arr[temp] + " ");
                temp++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueByArray queue = new QueueByArray(5);
        queue.print();
        queue.enqueue(01);
        queue.enqueue(02);
        queue.enqueue(03);
        queue.enqueue(04);
        queue.enqueue(05);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.print();
    }
}
