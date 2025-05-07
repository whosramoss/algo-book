class Node:
  def __init__(self, name):
    self.children = []
    self.name = name
  
  def add_child(self, name):
    self.children.append(Node(name))

  def depth_first_search(self, array):
    array.append(self.name)
    for child in self.children:
      child.depth_first_search(array)
    return array

root = Node("A")
root.add_child("B")
root.add_child("C")
root.children[0].add_child("D")  # B -> D
root.children[0].add_child("E")  # B -> E
root.children[1].add_child("F")  # C -> F

result = []
result = root.depth_first_search(result)
print(result)  # Output: ['A', 'B', 'D', 'E', 'C', 'F']