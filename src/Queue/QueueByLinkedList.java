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

    public void dequeue(){
        if (isEmpty()){
            System.out.println("underflow");
        }
        else{
            System.out.println("the deleted node is " + front.data);
            front = front.next;
        }
    }

    public void print(){
        Node temp = front;
        if (isEmpty()){
            System.out.println("uderflow");
        }
        else {
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node newNode = new Node(10);
        Node newNode2 = new Node(20);
        Node newNode3 = new Node(30);
        Node newNode4 = new Node(40);
        Node newNode5 = new Node(50);
        Node newNode6 = new Node(60);
        QueueByLinkedList queue = new QueueByLinkedList();
        queue.isEmpty();
        queue.enqueue(newNode);
        queue.enqueue(newNode2);
        queue.enqueue(newNode3);
        queue.enqueue(newNode4);
        queue.enqueue(newNode5);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        queue.enqueue(newNode6);
        queue.print();

    }
}
