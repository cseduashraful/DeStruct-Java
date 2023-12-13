import visualizer.*;
import java.util.ArrayList;

public class QuestionsHeap {
    public static void main(String args[]) {
        Visualizer.Initialize("ttPjdw9eqh1tyHdJb22A8ULtzIvxTQA1");

        // This enables the visualizer to visualize our defined Node<E> objects. If we make a new class object that we want to 
        // visualize, we need to add it here
        String[] classes = { "HeapNode" };
        Visualizer.addClassNamesToVisualizeValue(classes);

        /* Question 19 */
        // BEGIN PRIVATE CODE

        // END PRIVATE CODE
        
        /* Question 21 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE

        /* Question 22 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE
        
        /* Question 25 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE

        /* Question 28 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE
    }
}

final class MinHeap<E extends Comparable<E>> {
    ArrayList<E> heap;
    int size = 0;

    MinHeap() {
        heap = new ArrayList<>();
    }

    MinHeap(E[] a) {
        heap = new ArrayList<>();
        for (E e : a) {
            heap.add(e);
        }
        size = a.length;
    }

    /* Question 24 */
    public void add(E e) {
        // BEGIN PRIVATE CODE

        // END PRIVATE CODE
    }

    /* Question 23 */
    private void siftUp(int i) {
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE
    }

    /* Question 27 */
    public E remove() {
        // BEGIN PRIVATE CODE
        return null;
        // END PRIVATE CODE
    }

    /* Question 26 */
    private void siftDown(int i) {
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE
    }

    /* Question 22 */
    /**
     * Returns true iff the subtree of heap starting at index i is a min-heap.
     * @param a an array representing a mostly-complete tree, possibly a heap
     * @param i an index into that array representing a subtree rooted at i
     * @return true iff the subtree of heap starting at index i is a min-heap
     */
    public boolean isMinHeap(int i) {
        // BEGIN PRIVATE CODE
        return false;
        // END PRIVATE CODE
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private boolean hasLeft(int i) {
        return left(i) < size;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private boolean hasRight(int i) {
        return right(i) < size;
    }

    private void swap(int i, int j) {
        E t = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, t);
    }

    public HeapNode<E> treeifyHeap() {
        HeapNode<E> root = new HeapNode<>(heap.get(0));
        connect(root, 0);
        return root;
    }

    private void connect(HeapNode<E> parent, int parentIndex) {
        int leftIndex = 2 * parentIndex + 1;
        int rightIndex = 2 * parentIndex + 2;
        if (leftIndex < size) {
            HeapNode<E> left = new HeapNode<>(heap.get(leftIndex), parent);
            parent.left = left;
            connect(left, leftIndex);
        }
        if (rightIndex < size) {
            HeapNode<E> right = new HeapNode<>(heap.get(rightIndex), parent);
            parent.right = right;
            connect(right, rightIndex);
        }
        
    }
}
