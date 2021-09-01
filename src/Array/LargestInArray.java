package Array;

import java.util.Scanner;

public class LargestInArray {
    public static int[] input(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int largeInArray(int[] input){
        int size = input.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if(input[i] > max){
                max = input[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = input();
        int max = largeInArray(arr);
        System.out.println(max);
    }
}
