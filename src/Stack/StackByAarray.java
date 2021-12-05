package Stack;

public class StackByAarray {
    int[] arr;
    int top;

    public StackByAarray(int size){
        arr = new int[size];
        top = -1;
    }

    public Boolean isEmpty(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return true;
        }
        return false;
    }

    public Boolean isFull(){
        if (top == arr.length-1){
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }

    public void push(int data){
        if (isFull()){
            System.out.println("Stack Overflow");
        }
        else {
            top++;
            arr[top] = data;
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println(arr[top]);
        }
    }

    public static void main(String[] args) {
        StackByAarray stack = new StackByAarray(5);
        stack.isEmpty();
        stack.isFull();
        stack.push(5);
        stack.peek();
        stack.isEmpty();
        stack.isFull();
    }
}
