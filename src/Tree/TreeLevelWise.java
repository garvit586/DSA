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
}
