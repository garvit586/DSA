package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInput(Scanner s) {
        System.out.println("Enter the root");
        int n = s.nextInt();
        if (n == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(n);
        root.left = takeInput(s);
        root.right = takeInput(s);
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

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        QueueByLL<BinaryTreeNode<Integer>> pendingNodes = new QueueByLL<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.println("Enter the left child of " + frontNode.data);
            int leftChildData = s.nextInt();
            if (leftChildData != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftChildData);
                frontNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }
            System.out.println("Enter the right child of " + frontNode.data);
            int rightChildData = s.nextInt();
            if (rightChildData != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightChildData);
                frontNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        QueueByLL<BinaryTreeNode> q = new QueueByLL<>();
        q.enqueue(root);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                BinaryTreeNode<Integer> p = q.dequeue();
                System.out.print(p.data + " ");
                if (p.left != null) {
                    q.enqueue(p.left);
                }
                if (p.right != null) {
                    q.enqueue(p.right);
                }
                size--;
            }
            System.out.println();
        }
    }

    public static int countNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int count = 1;
        count += countNodes(root.left);
        count += countNodes(root.right);
        return count;
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);
    }

    public static int diameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1, Math.max(option2, option3));
    }

    public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Integer, Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }
        Pair<Integer, Integer> lo = heightDiameter(root.left);
        Pair<Integer, Integer> ro = heightDiameter(root.right);
        int height = 1 + Math.max(lo.first, ro.first);
        int option1 = lo.first + ro.first;
        int option2 = lo.second;
        int option3 = ro.second;
        int diameter = Math.max(option1, Math.max(option2, option3));
        Pair<Integer, Integer> output = new Pair<>();
        output.first = height;
        output.second = diameter;
        return output;
    }

    public static void InOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public static void PreOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void PostOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] in, int[] pre, int inS, int inE, int preS, int preE) {
        if(inS > inE){
            return null;
        }
        int rootData = pre[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex = -1;
        for (int i = inS; i <= inE; i++) {
            if(in[i] == rootData){
                rootIndex = i;
                break;
            }
        }
        if(rootIndex == -1){
            return null;
        }
        int leftInS = inS;
        int leftInE = rootIndex-1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = rootIndex + 1;
        int rightInE = inE;
        int rightPreS = leftPreE+1;
        int rightPreE = preE;
        root.left = buildTreeHelper(in ,pre, leftInS,leftInE,leftPreS,leftPreE);
        root.right = buildTreeHelper(in ,pre,rightInS,rightInE,rightPreS,rightPreE);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] in, int[] pre){
        return buildTreeHelper(in,pre,0,in.length-1,0,pre.length-1);
    }

    public static void main(String[] args) {
//        Scanner s  = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println(countNodes(root));
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println("=======================");
        System.out.println("height : " + heightDiameter(root).first);
        System.out.println("Diameter : " + heightDiameter(root).second);
        InOrder(root);
        System.out.println();
        PreOrder(root);
        System.out.println();
        PostOrder(root);
        int[] in = {4,2,5,1,6,3,7};
        int[] pre = {1,2,4,5,3,6,7};
        BinaryTreeNode<Integer> root2 = buildTree(in,pre);
        System.out.println();
        System.out.println("==========================");
        printLevelWise(root2);
    }
}
