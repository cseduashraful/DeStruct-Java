public class HeapNode<E> {
    
    E data;
    HeapNode<E> left;
    HeapNode<E> right;
    HeapNode<E> parent;
    String nodename = "NotSet";


    HeapNode(E d) {
        data = d;
    }

    HeapNode(E d, String nodename) {
        data = d;
        this.nodename = nodename;
    }

    HeapNode(E d, HeapNode<E> p) {
        data = d;
        parent = p;
    }

    HeapNode(E d, HeapNode<E> p, String nodename) {
        data = d;
        parent = p;
        this.nodename = nodename;
    }

    @Override
    public String toString() {
        return "HeapNode [data=" + data + "]";
    }
    
}
