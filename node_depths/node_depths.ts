class BST {
    value: number;
    left: BST | null;
    right: BST | null;

    constructor(value: number) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

function nodeDepths(root: BST | null, depth: number = 0): number {
    if (root === null) {
        return 0;
    }
    return depth + nodeDepths(root.left, depth + 1) + nodeDepths(root.right, depth + 1);
}

const bst = new BST(10);
bst.left = new BST(8);
bst.right = new BST(12);

console.log(nodeDepths(bst));  
