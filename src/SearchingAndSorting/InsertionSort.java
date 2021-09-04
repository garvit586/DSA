package SearchingAndSorting;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int j = i - 1;
            int temp = input[i];
            while (j >= 0 && input[j] > temp) {
                input[j + 1] = input[j];
                j--;
            }
            input[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        insertionSort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
