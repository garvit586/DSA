package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter the root");
        int n = s.nextInt();
        if (n == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
}
