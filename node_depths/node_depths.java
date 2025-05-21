class BST {
    int value;
    BST left;
    BST right;

     BST(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public static int nodeDepths(BST root) {
        return nodeDepthsHelper(root, 0);
    }

    private static int nodeDepthsHelper(BST node, int depth) {
        if (node == null) {
            return 0;
        }
        return depth + nodeDepthsHelper(node.left, depth + 1) + nodeDepthsHelper(node.right, depth + 1);
    }

    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.left = new BST(8);
        bst.right = new BST(12);
        System.out.println(nodeDepths(bst)); 
    }
}
