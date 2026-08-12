---
name: remove_duplicates_from_linked_list
level: easy
---

# Remove Duplicates from Linked List

## 🇬🇧 English

The problem consists of removing duplicate elements from a linked list. Given a linked list with potential duplicate values, the task is to remove consecutive nodes that have the same value.

### Problem Explanation:

Given a linked list, the goal is to iterate through the list and remove any consecutive node that has the same value as the previous node. This is done iteratively, adjusting the list's pointers to "skip" the duplicate nodes.

### Input:

- A `LinkedList` where each node has:
  - An integer value.
  - A pointer to the next node (or `null` if it's the last node).

### Output:

- Returns the linked list with duplicate values removed.

### Example:

```python
linked_list = LinkedList(1)
linked_list.next = LinkedList(1)
linked_list.next.next = LinkedList(2)
linked_list = remove_duplicates_from_linked_list(linked_list)

print(linked_list.value)  # Output: 1
print(linked_list.next.value)  # Output: 2
```

---

## 🇧🇷 Português

O problema consiste em remover os elementos duplicados de uma lista ligada. Dado um linked list com possíveis valores repetidos, a tarefa é remover os nós consecutivos que tenham o mesmo valor.

### Explicação do Problema:

Dado um linked list, o objetivo é iterar sobre a lista e remover qualquer nó consecutivo que tenha o mesmo valor do nó anterior. O processo é feito de maneira iterativa, ajustando os ponteiros da lista para "pular" os nós duplicados.

### Entrada:

- Um `LinkedList` (lista ligada) onde cada nó tem:
  - Um valor inteiro.
  - Um ponteiro para o próximo nó (ou `null` no caso de ser o último nó).

### Saída:

- Retorna a lista ligada com os valores duplicados removidos.

### Exemplo:

#### Exemplo 1:

```python
linked_list = LinkedList(1)
linked_list.next = LinkedList(1)
linked_list.next.next = LinkedList(2)
linked_list = remove_duplicates_from_linked_list(linked_list)

print(linked_list.value)  # Output: 1
print(linked_list.next.value)  # Output: 2
```

## Response

### Python

```python
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
```
---

### Typescript


```typescript
class LinkedList {
    value: number;
    next: LinkedList | null;

    constructor(value: number) {
        this.value = value;
        this.next = null;
    }

    static removeDuplicatesFromLinkedList(linkedList: LinkedList | null): LinkedList | null {
        let currentNode = linkedList;
        while (currentNode !== null) {
            const nextNode = currentNode.next;
            if (nextNode !== null && currentNode.value === nextNode.value) {
                currentNode.next = nextNode.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return linkedList;
    }
}

const linkedList = new LinkedList(1);
linkedList.next = new LinkedList(1);
linkedList.next.next = new LinkedList(2);

const updatedList = LinkedList.removeDuplicatesFromLinkedList(linkedList);
console.log(updatedList); 
console.log(updatedList?.value); 
console.log(updatedList?.next?.value);
```
