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

    public static void print(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        String toBePrinted = root.data + "";
        if (root.left != null){
            toBePrinted += "L:" + root.left.data + ",";
        }
        if (root.right != null){
            toBePrinted += "R:" + root.right.data + ",";
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        print(root);
    }
}
