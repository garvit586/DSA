package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(20);
        list.add(23);
        list.add(25);
        System.out.println(list.size());
    }

}
