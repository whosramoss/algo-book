def node_depths(root, depth=0):
  if root is None:
    return 0
  return depth + node_depths(root.left, depth + 1) + node_depths(root.right, depth + 1)

class BST:
  def __init__(self, value):
      self.value = value
      self.left = None
      self.right = None


bst = BST(10)
bst.left = BST(8)
bst.right = BST(12)

print(node_depths(bst))
