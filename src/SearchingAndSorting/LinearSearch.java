package SearchingAndSorting;

import java.util.Scanner;

public class LinearSearch {
    public static int search(int[] input, int element){
        int size = input.length;
        for (int i = 0; i < size; i++) {
            if (input[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int index = search(arr,30);
        System.out.println(index);
    }
}
