package Array;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] +  " ");
        }
        System.out.println();
    }
}
