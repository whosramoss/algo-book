class BST {
  value: number;
  left: BST | null = null;
  right: BST | null = null;

  constructor(value: number) {
    this.value = value;
  }

  insert(value: number): this {
    let currentNode: BST = this;
    while (true) {
      if (value < currentNode.value) {
        if (!currentNode.left) {
          currentNode.left = new BST(value);
          break;
        } else {
          currentNode = currentNode.left;
        }
      } else {
        if (!currentNode.right) {
          currentNode.right = new BST(value);
          break;
        } else {
          currentNode = currentNode.right;
        }
      }
    }
    return this;
  }

  contains(value: number): boolean {
    let currentNode: BST | null = this;
    while (currentNode) {
      if (value < currentNode.value) {
        currentNode = currentNode.left;
      } else if (value > currentNode.value) {
        currentNode = currentNode.right;
      } else {
        return true;
      }
    }
    return false;
  }

  remove(value: number, parentNode: BST | null = null): this {
    let currentNode: BST | null = this;
    while (currentNode) {
      if (value < currentNode.value) {
        parentNode = currentNode;
        currentNode = currentNode.left;
      } else if (value > currentNode.value) {
        parentNode = currentNode;
        currentNode = currentNode.right;
      } else {
        if (currentNode.left && currentNode.right) {
          currentNode.value = currentNode.right.getMinValue();
          currentNode.right.remove(currentNode.value, currentNode);
        } else if (!parentNode) {
          if (currentNode.left) {
            currentNode.value = currentNode.left.value;
            currentNode.right = currentNode.left.right;
            currentNode.left = currentNode.left.left;
          } else if (currentNode.right) {
            currentNode.value = currentNode.right.value;
            currentNode.left = currentNode.right.left;
            currentNode.right = currentNode.right.right;
          } else {
            // Single node tree, do nothing
          }
        } else if (parentNode.left === currentNode) {
          parentNode.left = currentNode.left
            ? currentNode.left
            : currentNode.right;
        } else if (parentNode.right === currentNode) {
          parentNode.right = currentNode.left
            ? currentNode.left
            : currentNode.right;
        }
        break;
      }
    }
    return this;
  }

  getMinValue(): number {
    let currentNode: BST = this;
    while (currentNode.left) {
      currentNode = currentNode.left;
    }
    return currentNode.value;
  }
}

// Example usage
const bst = new BST(10);
bst.insert(5).insert(4).insert(6).insert(15).insert(12).insert(17);

bst.remove(10);
console.log(bst.contains(10)); // false
