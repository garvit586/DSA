package BinaryTree;

import java.util.Scanner;

public class BST {
    public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int value){
        if(root == null){
            root = new BinaryTreeNode<>(value);
            return root;
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        }
        if(value > root.data){
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void print(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String toBePrinted = root.data + "";
        if (root.left != null) {
            toBePrinted += "L:" + root.left.data + ",";
        }
        if (root.right != null) {
            toBePrinted += "R:" + root.right.data + ",";
        }
        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);
    }

}
