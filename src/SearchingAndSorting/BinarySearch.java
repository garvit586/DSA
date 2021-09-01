package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] input, int element) {
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (input[mid] == element) {
                return mid;
            } else if (element > input[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
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
        int index = binarySearch(arr, 30);
        System.out.println(index);
    }
}
