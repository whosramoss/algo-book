class BST {
  value: number;
  left: BST | null = null;
  right: BST | null = null;

  constructor(value: number) {
      this.value = value;
  }
}

function findClosestValueInBST(tree: BST, target: number): number {
  let currentNode: BST | null = tree;
  let closestValue = currentNode.value;

  while (currentNode !== null) {
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

const bst = new BST(10);
bst.left = new BST(8);
bst.right = new BST(12);

console.log(findClosestValueInBST(bst, 20));
