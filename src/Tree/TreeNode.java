package Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    public T data;
    public List<TreeNode<T>> child;

    public TreeNode(T data){
        this.data = data;
        child = new ArrayList<TreeNode<T>>();
    }
}
