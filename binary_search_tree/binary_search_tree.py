class BST:
  def __init__(self, value):
    self.value = value
    self.left = None
    self.right = None

  # Average: O(log(n)) time | O(1) space
  # Worst: O(n) time | O(1) space
  def insert(self, value):
    current_node = self
    while True:
      if value < current_node.value:
        if current_node.left is None:
          current_node.left = BST(value)
          break
        else:
          current_node = current_node.left
      else:
        if current_node.right is None:
          current_node.right = BST(value)
          break
        else:
          current_node = current_node.right
    return self


  # Average: O(log(n)) time | O(1) space
  # Worst: O(n) time | O(1) space
  def contains(self, value):
    current_node = self
    while current_node is not None:
      if value < current_node.value:
        current_node = current_node.left
      elif value > current_node.value:
        current_node = current_node.right
      else:
        return True
    return False

  # Average: O(log(n)) time | O(1) space
  # Worst: O(n) time | O(1) space
  def remove(self, value, parent_node = None):
    current_node = self
    while current_node is not None:
      if value < current_node.value:
        parent_node = current_node
        current_node = current_node.left
      elif value > current_node.value:
        parent_node = current_node
        current_node = current_node.right
      else:
        if current_node.left is not None and current_node.right is not None:
          current_node.value = current_node.right.get_min_value()
          current_node.right.remove(current_node.value, current_node)
        elif parent_node is None:
          if current_node.left is not None:
            current_node.value = current_node.left.value
            current_node.right = current_node.left.right
            current_node.left = current_node.left.left
          elif current_node.right is not None:
            current_node.value = current_node.right.value
            current_node.left = current_node.right.left
            current_node.right = current_node.right.right
          else:
            pass
        elif parent_node.left == current_node:
          parent_node.left = current_node.left if current_node.left is not None else current_node.right
        elif parent_node.right == current_node:
          parent_node.right = current_node.left if current_node.left is not None else current_node.right
        break
    return self

  def get_min_value(self):
    current_node = self
    while current_node.left is not None:
      current_node = current_node.left
    return current_node.value

bst = BST(10)
bst.insert(5).insert(4).insert(6).insert(15).insert(12).insert(17)

print(bst.remove(10).contains(10))

