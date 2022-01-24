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

}
