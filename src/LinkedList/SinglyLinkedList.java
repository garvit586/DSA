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



}
