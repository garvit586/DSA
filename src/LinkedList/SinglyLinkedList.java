package LinkedList;

public class SinglyLinkedList {
    private static Node head;

    public static void insertFirst(Node newNode){
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static  void insertLast(Node newNode){
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void insertAtPosition(Node newNode, int position){
        if (position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }

        if (position == 1){
            newNode.next = head.next;
            head.next = newNode;
            return;
        }

        Node temp = head;
        int i = 0;
        while(i < position-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void print(){
        if (head == null){
            System.out.println("LinkedList is empty");
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void deleteFirst(){
        if (head == null){
            System.out.println("LinkedList is Empty");
        }
        head = head.next;
    }

    public static void deleteLast(){
        if (head ==null){
            System.out.println("LinkedList is empty");
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void main(String[] args) {
        Node newNode0 = new Node(10);
        Node newNode1 = new Node(20);
        Node newNode2 = new Node(30);
        Node newNode3 = new Node(40);
        Node newNode4 = new Node(50);
        Node newNode5 = new Node(60);
        Node newNode6 = new Node(70);
        Node newNode7 = new Node(25);
        Node newNode8 = new Node(55);
        Node newNode9 = new Node(65);

        insertFirst(newNode0);
        insertFirst(newNode1);
        insertFirst(newNode2);
        insertFirst(newNode3);
        insertLast(newNode4);
        insertLast(newNode5);
        insertLast(newNode6);

        print();
        System.out.println();

        insertAtPosition(newNode7,4);
        insertAtPosition(newNode8,6);
        insertAtPosition(newNode9,7);

        print();
        System.out.println();
        deleteFirst();
        print();
        System.out.println();
        deleteLast();
        print();

    }




}
