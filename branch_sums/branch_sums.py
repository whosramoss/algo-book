def branch_sums(root):
  sums = []
  calculate_branch_sums(root, 0, sums)
  return sums

def calculate_branch_sums(node, running_sum, sums):
  if node is None:
    return
  new_running_sum = running_sum + node.value
  if node.left is None and node.right is None:
    sums.append(new_running_sum)
    return
  calculate_branch_sums(node.left, new_running_sum, sums)
  calculate_branch_sums(node.right, new_running_sum, sums)

class BinaryTree:
  def __init__(self, value) -> None:
      self.value = value
      self.left = None
      self.right = None


bst = BinaryTree(10)
bst.left = BinaryTree(8)
bst.left.left = BinaryTree(7)
bst.left.right = BinaryTree(9)
bst.right = BinaryTree(12)
bst.right.left = BinaryTree(11)
bst.right.right = BinaryTree(13)
print(branch_sums(bst))