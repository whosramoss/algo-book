class BinaryTree {
  value: number;
  left: BinaryTree | null;
  right: BinaryTree | null;

  constructor(value: number) {
      this.value = value;
      this.left = null;
      this.right = null;
  }
}

function branchSums(root: BinaryTree): number[] {
  const sums: number[] = [];
  calculateBranchSums(root, 0, sums);
  return sums;
}

function calculateBranchSums(node: BinaryTree | null, runningSum: number, sums: number[]): void {
  if (node === null) {
      return;
  }

  const newRunningSum = runningSum + node.value;

  if (node.left === null && node.right === null) {
      sums.push(newRunningSum);
      return;
  }

  calculateBranchSums(node.left, newRunningSum, sums);
  calculateBranchSums(node.right, newRunningSum, sums);
}


const bst = new BinaryTree(10);
bst.left = new BinaryTree(8);
bst.left.left = new BinaryTree(7);
bst.left.right = new BinaryTree(9);
bst.right = new BinaryTree(12);
bst.right.left = new BinaryTree(11);
bst.right.right = new BinaryTree(13);

console.log(branchSums(bst));
