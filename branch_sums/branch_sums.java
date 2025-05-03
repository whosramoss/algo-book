import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree(10);
        bst.left = new BinaryTree(8);
        bst.left.left = new BinaryTree(7);
        bst.left.right = new BinaryTree(9);
        bst.right = new BinaryTree(12);
        bst.right.left = new BinaryTree(11);
        bst.right.right = new BinaryTree(13);

        List<Integer> result = BranchSums.branchSums(bst);
        System.out.println(result);
    }
}

class BranchSums {

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<>();
        calculateBranchSums(root, 0, sums);
        return sums;
    }

    private static void calculateBranchSums(BinaryTree node, int runningSum, List<Integer> sums) {
        if (node == null) {
            return;
        }

        int newRunningSum = runningSum + node.value;

        if (node.left == null && node.right == null) {
            sums.add(newRunningSum);
            return;
        }

        calculateBranchSums(node.left, newRunningSum, sums);
        calculateBranchSums(node.right, newRunningSum, sums);
    }
}
