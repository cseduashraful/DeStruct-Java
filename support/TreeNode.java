import java.util.Random;

public class TreeNode<E> {
    
    E data;
    TreeNode<E> left;
    TreeNode<E> right;
    TreeNode<E> parent;
    String nodename = "NotSet";


    TreeNode(E d) {
        data = d;
    }

    TreeNode(E d, String nodename) {
        data = d;
        this.nodename = nodename;
    }

    TreeNode(E d, TreeNode<E> p) {
        data = d;
        parent = p;
    }

    TreeNode(E d, TreeNode<E> p, String nodename) {
        data = d;
        parent = p;
        this.nodename = nodename;
    }

    @Override
    public String toString() {
        return "TreeNode [data=" + data + "]";
    }
    
}
