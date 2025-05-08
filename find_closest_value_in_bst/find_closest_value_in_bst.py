def find_closest_value_in_bst(tree, target):
  current_node = tree
  closest_value = current_node.value

  while current_node is not None:
    if target > current_node.value:
      if abs(current_node.value - target) < abs(closest_value - target):
        closest_value = current_node.value
      current_node = current_node.right
    else:
      if abs(current_node.value - target) < abs(closest_value - target):
        closest_value = current_node.value
      current_node = current_node.left
  return closest_value

class BST:
  def __init__(self, value):
      self.value = value
      self.left = None
      self.right = None


bst = BST(10)
bst.left = BST(8)
bst.right = BST(12)

print(find_closest_value_in_bst(bst, 20))
