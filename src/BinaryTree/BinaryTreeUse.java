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

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root");
        int rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        QueueByLL<BinaryTreeNode<Integer>> pendingNodes = new QueueByLL<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.println("Enter the left child of " + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData !=-1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftChildData);
                frontNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }
            System.out.println("Enter the right child of " + frontNode.data);
            int rightChildData = s.nextInt();
            if(rightChildData != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightChildData);
                frontNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        if(root == null){
            return ;
        }
        QueueByLL<BinaryTreeNode> q = new QueueByLL<>();
        q.enqueue(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size > 0){
                BinaryTreeNode<Integer> p = q.dequeue();
                System.out.print(p.data + " ");
                if(p.left != null){
                    q.enqueue(p.left);
                }
                if(p.right != null){
                    q.enqueue(p.right);
                }
                size--;
            }
            System.out.println();
        }
    }

    public static int countNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int count = 1;
        count += countNodes(root.left);
        count += countNodes(root.right);
        return count;
    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh , rh);
    }

    public static int diameter(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1 , Math.max(option2,option3));
    }

    public static void main(String[] args) {
//        Scanner s  = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println(countNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
    }
}
