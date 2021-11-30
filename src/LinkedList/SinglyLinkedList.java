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
}
