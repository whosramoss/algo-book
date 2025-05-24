from os import link

def remove_duplicates_from_linked_list(linked_list):
  current_node = linked_list
  while current_node is not None:
    next_node = current_node.next
    if next_node is not None:
      if current_node.value == next_node.value:
        current_node.value = next_node.value
        current_node.next = next_node.next
      else:
        current_node = current_node.next
    else:
      current_node = current_node.next

    return linked_list

class LinkedList:
  def __init__(self,value) -> None:
      self.value = value
      self.next = None

linked_list = LinkedList(1)
linked_list.next = LinkedList(1)
linked_list.next.next = LinkedList(2)
linked_list = remove_duplicates_from_linked_list(linked_list)

print(
  linked_list.value,
  linked_list.next.value
)