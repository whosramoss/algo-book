public class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }

    public BST insert(int value) {
        BST current = this;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new BST(value);
                    break;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    current.right = new BST(value);
                    break;
                } else {
                    current = current.right;
                }
            }
        }
        return this;
    }

    public boolean contains(int value) {
        BST current = this;
        while (current != null) {
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public BST remove(int value, BST parent) {
        BST current = this;
        while (current != null) {
            if (value < current.value) {
                parent = current;
                current = current.left;
            } else if (value > current.value) {
                parent = current;
                current = current.right;
            } else {
                if (current.left != null && current.right != null) {
                    current.value = current.right.getMinValue();
                    current.right.remove(current.value, current);
                } else if (parent == null) { // root node
                    if (current.left != null) {
                        current.value = current.left.value;
                        current.right = current.left.right;
                        current.left = current.left.left;
                    } else if (current.right != null) {
                        current.value = current.right.value;
                        current.left = current.right.left;
                        current.right = current.right.right;
                    } else {
                        // Single-node tree, do nothing
                    }
                } else if (parent.left == current) {
                    parent.left = (current.left != null) ? current.left : current.right;
                } else if (parent.right == current) {
                    parent.right = (current.left != null) ? current.left : current.right;
                }
                break;
            }
        }
        return this;
    }

    public int getMinValue() {
        BST current = this;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }

    public static void main(String[] args) {
        BST bst = new BST(10);
        bst.insert(5).insert(4).insert(6).insert(15).insert(12).insert(17);

        bst.remove(10, null);
        System.out.println(bst.contains(10)); // false
    }
}
