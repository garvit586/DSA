package javaBasic;

import java.util.Scanner;

public class CharacterPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        while(i<=n){
            int j=1;
            while (j<=n){
                char ch = (char) ('A'+j-1);
                System.out.print(ch);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
