package javaBasic;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        while(i<=n){
            int j=1;
            int t = i;
            while (j<=i){
                System.out.print(t);
                j++;
                t++;
            }
            System.out.println();
            i++;
        }

    }
}
