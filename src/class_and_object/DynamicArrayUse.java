package class_and_object;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();

        for (int i = 0; i < 100; i++) {
            d.add(i+10);
        }

        System.out.println(d.size());
    }
}
