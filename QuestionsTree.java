import visualizer.*;

class QuestionsTree {

    public static void main(String args[]) {
        Visualizer.Initialize("ttPjdw9eqh1tyHdJb22A8ULtzIvxTQA1");

        // This enables the visualizer to visualize our defined Node<E> objects. If we make a new class object that we want to 
        // visualize, we need to add it here
        String[] classes = { "TreeNode" };
        Visualizer.addClassNamesToVisualizeValue(classes);

        // We can now build out the code to visualize our data structures.
        
        /* Question 2 */
        // BEGIN PRIVATE CODE

        // END PRIVATE CODE

        /* Question 4 */
        // BEGIN PRIVATE CODE

        // END PRIVATE CODE

        /* Question 5 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE

        /* Question 7 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE

        /* Question 11 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE
        
        /* Question 15 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE

        /* Question 17 */
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE

    }
}

final class MyBST<E extends Comparable<E>> {
    // Root of BST
    TreeNode<E> root;
    int size = 0;

    /* Question 1 */
    public void insert(E e) {
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE
    }

    /* Question 3 */
    public void insert(E data, TreeNode<E> node) {
        // BEGIN PRIVATE CODE
        
        // END PRIVATE CODE
    }

    public int size() {
        return size;
    }

    /* Question 7 */
    public int height(TreeNode<E> node) {
        // BEGIN PRIVATE CODE
        return -1;
        // END PRIVATE CODE
    }

    public TreeNode<E> search(E data) {
        return search(data, root);
    }


    /* Question 10 */
    private TreeNode<E> search(E data, TreeNode<E> node) {
        // BEGIN PRIVATE CODE
        return null;
        // END PRIVATE CODE
    }

    /* Question 14 */
    public boolean isAVL(TreeNode<E> n) {
        // BEGIN PRIVATE CODE
        return false;
        // END PRIVATE CODE
    }


    /* Question 17 */
    public void rotateRR(TreeNode<E> n) {
        // BEGIN PRIVATE CODE
        TreeNode<E> A, B, T1, T2, T3, p; 
        
        
        // END PRIVATE CODE
    }

}