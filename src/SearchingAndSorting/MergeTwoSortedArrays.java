package SearchingAndSorting;

import java.util.Scanner;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < arr1.length) {
            ans[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of first array");
        int size1 = s.nextInt();
        System.out.println("enter the array");
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = s.nextInt();
        }
        System.out.println("enter the size of second array");
        int size2 = s.nextInt();
        System.out.println("enter the array");
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = s.nextInt();
        }
        int[] ans = merge(arr1,arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
