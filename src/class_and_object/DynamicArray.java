package class_and_object;

public class DynamicArray {
    private int data[];
    private int nextIndex;

    public DynamicArray(){
        data = new int[5];
        nextIndex = 0;
    }

    public int size(){
        return nextIndex;
    }

    public void add(int element){
        if (nextIndex == data.length){
            restructure();
        }
        data[nextIndex] = element;
        nextIndex++;
    }

    private void restructure(){
        int temp[] = data;
        data = new int[data.length*2];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }
}
