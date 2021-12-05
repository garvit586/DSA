package Stack;

public class StackByLinkedList {
     ListNode top;

    public StackByLinkedList(){
        top = null;
    }

    public Boolean isEmpty(){
        if(top == null){
            System.out.println("Stack is empty");
            return true;
        }
        else{
            return false;
        }
    }

    public void push(ListNode newNode){
        if(isEmpty()){
            top = newNode;
            System.out.println("The Node is pushed");
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }


    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("The poped node is " + top.data);
            top = top.next;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
        }
        else{
            System.out.println(top.data);
        }
    }

    public static void main(String[] args) {
        StackByLinkedList stack = new StackByLinkedList();
        ListNode newNode1 = new ListNode(5);
        ListNode newNode2 = new ListNode(10);
        ListNode newNode3 = new ListNode(15);
        ListNode newNode4 = new ListNode(20);
        ListNode newNode5 = new ListNode(25);
        stack.isEmpty();
        stack.push(newNode1);
        stack.push(newNode2);
        stack.push(newNode3);
        stack.push(newNode4);
        stack.push(newNode5);
        stack.peek();
        stack.isEmpty();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.peek();
    }
}
