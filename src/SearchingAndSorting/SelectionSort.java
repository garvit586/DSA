package SearchingAndSorting;

import java.util.Scanner;

public class SelectionSort {

    public static void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            int min = input[i];
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                input[minIndex] = input[i];
                input[i] = min;

            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        sort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
