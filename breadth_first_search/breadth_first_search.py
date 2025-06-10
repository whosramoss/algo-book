class Node:
  def __init__(self, name) -> None:
      self.children = []
      self.name = name

  def add_child(self, name):
    self.children.append(Node(name))
    return self
  
  def breadth_first_search(self, array):
    queue = [self]
    while len(queue) > 0:
      current_node = queue.pop(0)
      array.append(current_node.name)
      for node in current_node.children:
        queue.append(node)
    return array

myTree = Node(1).add_child(2).add_child(3).add_child(4)
print(myTree.breadth_first_search([]))