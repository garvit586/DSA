package Array;

import java.util.Scanner;

public class LargestColSum {
    public static int[][] input(){
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int column = s.nextInt();
        int[][] arr = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static void print(int[][] input){
        int row = input.length;
        int column = input[1].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void largestColSum(int[][] input){
        int rows = input.length;
        int column = input[0].length;
        int largest = Integer.MIN_VALUE;
        for (int j = 0; j <column; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + input[i][j];
            }
            if (sum > largest){
                largest = sum;
            }
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        int[][] arr = input();
        print(arr);
        largestColSum(arr);
    }
}
