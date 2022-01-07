package Tree;

import java.util.Scanner;

public class TreeByUserInput {

    public static TreeNode<Integer> takeInput(){
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the next Node");
        int n = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter the number of children of " + n);
        int childCount = s.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput();
            root.child.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root){
        String s = root.data + ":";
        for (int i = 0; i < root.child.size(); i++) {
            s = s + root.child.get(i);
        }
        for (int i = 0; i < root.child.size(); i++) {
            print(root.child.get(i));
        }
    }
    public static void main(String[] args) {

    }
}
