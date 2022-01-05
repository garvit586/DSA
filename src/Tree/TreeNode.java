package Tree;

import java.util.ArrayList;

public class TreeNode<T> {
    public T data;
    public ArrayList<TreeNode<T>> child;

    public TreeNode(T data){
        this.data = data;
        child = new ArrayList<TreeNode<T>>();
    }
}
