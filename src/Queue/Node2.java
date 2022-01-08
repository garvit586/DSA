package Queue;

public class Node2<T> {
    T data;
    Node2<T> next;

    public Node2(T value){
        data = value;
        next = null;
    }
}
