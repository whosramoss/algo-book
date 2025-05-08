public class BST {
    int value;
    BST left;
    BST right;

    BST(int value) {
        this.value = value;
    }

    public static int findClosestValueInBST(BST tree, int target) {
        BST currentNode = tree;
        int closestValue = currentNode.value;

        while (currentNode != null) {
            if (Math.abs(currentNode.value - target) < Math.abs(closestValue - target)) {
                closestValue = currentNode.value;
            }
            if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                currentNode = currentNode.left;
            }
        }
        return closestValue;
    }

    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.left = new BST(8);
        bst.right = new BST(12);

        int result = findClosestValueInBST(bst, 20);
        System.out.println(result);  
    }
}
