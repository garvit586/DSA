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

    public static void elementsBetweenk1k2O(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (k1 < root.data) {
            elementsBetweenk1k2O(root.left, k1, k2);
        }
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }
        elementsBetweenk1k2O(root.right, k1, k2);
    }

    public static int minimum(BinaryTreeNode<Integer> root){
        if(root == null){
            return  Integer.MAX_VALUE;
        }
        return Math.min(root.data , Math.min(minimum(root.left),minimum(root.right)));
    }

    public static int maximum(BinaryTreeNode<Integer> root){
        if(root == null){
            return  Integer.MIN_VALUE;
        }
        return Math.max(root.data , Math.max(maximum(root.left),maximum(root.right)));
    }

    public static boolean isBst(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftMax= maximum(root.left);
        int rightMin = minimum(root.right);

        if(root.data < leftMax || root.data > rightMin){
            return false;
        }
        if(isBst(root.left) && isBst(root.right)){
            return true;
        }
        else {
            return false;
        }
    }

    public Pair<Boolean,Pair<Integer,Integer>> isBstBetter(BinaryTreeNode<Integer> root){
        if(root == null){
            Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
            output.first = true;
            output.second = new Pair<Integer,Integer>();
            output.second.first = Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean,Pair<Integer,Integer>> leftOutput = isBstBetter(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightOutput = isBstBetter(root.right);
        int min = Math.min(root.data, Math.min(leftOutput.second.first,rightOutput.second.first));
        int max = Math.max(root.data, Math.max(leftOutput.second.second,rightOutput.second.second));
        boolean isBST = (root.data < leftOutput.second.second) && (root.data > rightOutput.second.first)
                && leftOutput.first && rightOutput.first;
        Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean,Pair<Integer,Integer>>();
        output.first = isBST;
        output.second = new Pair<Integer,Integer>();
        output.second.first = min;
        output.second.second = max;
        return output;
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
        elementsBetweenk1k2O(root, 2, 10);
    }
}
