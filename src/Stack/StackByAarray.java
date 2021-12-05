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
            System.out.println("The value " + data + " is Pushed");
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            System.out.println("The poped value is " + arr[top]);
            top --;
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }
        else {
            System.out.println("The peek value is " + arr[top]);
        }
    }

    public void deleteStack(){
        arr = null;
        System.out.println("The Stack is deleted");
    }

    public static void main(String[] args) {
        StackByAarray stack = new StackByAarray(5);
        stack.isEmpty();
        stack.isFull();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.peek();
        stack.isEmpty();
        stack.isFull();
        stack.pop();
        stack.peek();
        stack.deleteStack();
    }
}
