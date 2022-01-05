package Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    T data;
    List<TreeNode<T>> child;

    public TreeNode(T data){
        this.data = data;
        child = new ArrayList<TreeNode<T>>();
    }
}
