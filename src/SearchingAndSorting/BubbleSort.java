package SearchingAndSorting;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] input){
        for (int i = 0; i < input.length-1; i++) {
            for (int j = 0; j < input.length-i-1; j++) {
                if (input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
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
        bubbleSort(arr);
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
