package Tree;

import java.util.Scanner;

public class TreeLevelWise {
    public static TreeNode<Integer> takeInput(){
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();
        QueueByLL<TreeNode<Integer>> pendingNode = new QueueByLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNode.enqueue(root);
        while(!pendingNode.isEmpty()){
            TreeNode<Integer> frontNode = pendingNode.dequeue();
            System.out.println("Enter the no. of children of " + frontNode.data);
            int childCount = s.nextInt();
            for (int i = 0; i < childCount; i++) {
                System.out.println("Enter the " + i + "th child of " + frontNode.data);
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.child.add(childNode);
                pendingNode.enqueue(childNode);
            }
        }
    return root;
    }

    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for (int i = 0; i < root.child.size(); i++) {
            s = s + root.child.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.child.size(); i++) {
            print(root.child.get(i));
        }
    }

    public static int numberOfNodes(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.child.size(); i++) {
            count = count + numberOfNodes(root.child.get(i));
        }
        return count;
    }

    public static int largest(TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (int i = 0; i < root.child.size(); i++) {
            int childLargest = largest(root.child.get(i));
            if(childLargest  > ans){
                ans = childLargest;
            }
        }
        return  ans;
    }

    public static void printK(TreeNode<Integer> root , int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.child.size(); i++) {
            printK(root.child.get(i) , k-1);
        }
    }

    public static int countLeaves(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.child.size() == 0){
            return 1;
        }
        int leaves = 0;
        for (int i = 0; i < root.child.size(); i++) {
            leaves = leaves + countLeaves(root.child.get(i));
        }
        return leaves;
    }

    public static int height(TreeNode<Integer> root){
        int h = 0;
        for (int i = 0; i < root.child.size(); i++) {
            int ch = height(root.child.get(i));
            h= Math.max(h,ch);
        }

        h=h+1;
        return h;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        print(root);
        System.out.println();
        System.out.println(numberOfNodes(root));
        System.out.println();
        System.out.println(largest(root));
        System.out.println();
        printK(root , 2);
        System.out.println();
        System.out.println(countLeaves(root));
        System.out.println();
        System.out.println(height(root));
    }
}
