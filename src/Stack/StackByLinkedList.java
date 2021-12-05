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
}
