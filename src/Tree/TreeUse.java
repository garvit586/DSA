package Tree;

public class TreeUse {
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

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(40);
        TreeNode<Integer> node1 = new TreeNode<>(50);
        TreeNode<Integer> node2 = new TreeNode<>(60);
        TreeNode<Integer> node3 = new TreeNode<>(70);
        TreeNode<Integer> node4 = new TreeNode<>(80);
        TreeNode<Integer> node5 = new TreeNode<>(90);
        root.child.add(node1);
        root.child.add(node2);
        root.child.add(node5);
        node2.child.add(node3);
        node2.child.add(node4);
        print(root);
    }

}
