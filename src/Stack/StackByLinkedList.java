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

}
