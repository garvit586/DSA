package BinaryTree;

import java.util.Scanner;

public class BST {
    public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int value) {
        if (root == null) {
            root = new BinaryTreeNode<>(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        if (value > root.data) {
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

    public static boolean search(BinaryTreeNode<Integer> root, int value) {
        if (root == null) {
            return false;
        }
        if (root.data == value) {
            return true;
        }
        if (value < root.data) {
            return search(root.left, value);
        } else {
            return search(root.right, value);
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(25);
        insert(root, 10);
        insert(root, 20);
        insert(root, 30);
        insert(root, 40);
        insert(root, 5);
        insert(root, 8);
        insert(root, 2);
        System.out.println();
        print(root);
        System.out.println(search(root, 40));
        System.out.println(search(root, 100));
    }
}
