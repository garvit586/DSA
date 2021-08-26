/*   Created by IntelliJ IDEA.
 *   Author: Garvit Gupta
 *   Date: 26-05-2021
 *   Time: 15:16
 *   File: pattern2.java
 */
package javaBasic;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n){
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
