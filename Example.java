import visualizer.*;

class Example {
    public static void main(String args[]) {

        // We need to initialize the visualizer with the API key
        Visualizer.Initialize("UrWNWK5Mt4LbXascgog0UBBqNrsZpd6v");

        // This enables the visualizer to visualize our defined Node<E> objects. If we make a new class object that we want to 
        // visualize, we need to add it here
        String[] classes = { "TreeNode" };
        Visualizer.addClassNamesToVisualizeValue(classes);

        /*  
         * We can now build out the code to visualize our data structures.
         */

        // Initialize a node with a nodename (nodename is optional and will be used in the visualization) 
        TreeNode<Integer> node = new TreeNode<Integer>(5, "node");
        TreeNode<Integer> nodeleft = new TreeNode<Integer>(4, "nodeleft");
        TreeNode<Integer> noderight = new TreeNode<Integer>(2, "noderight");
        // Connect the nodes (left, right, parent references will show up in the visualization connecting the nodes)
        node.left = nodeleft;
        node.right = noderight;
        node.parent = null;
        // nodeleft.parent = node;
        noderight.parent = node;

        // Register the nodes to visualize. Any node that is not connected in some way to a registered node will not be visualized
        Visualizer.register(node);
        Visualizer.Visualize("Step 1");

        // We can also visualize the nodes in our data structure by calling Visualize() with the root node as an argument. This will
        // still require you to register the nodes you want to visualize
        Visualizer.Visualize(node, "Step 1x");


        
        // Visualizer.Visualize(mynode); //or
        
    }
}