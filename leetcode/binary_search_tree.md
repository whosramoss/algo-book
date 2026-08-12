---
name: binary_search_tree
level: medium
---

# Binary Search Tree (BST)

## 🇬🇧 English

A Binary Search Tree (BST) is a data structure that stores elements in a hierarchical order, where each node has up to two children: left and right. For each node, all elements in the left subtree are less than the node's value, and all elements in the right subtree are greater or equal.

This structure allows efficient operations such as insertion, search (contains), and removal of values.

### Input:

- A series of integer values to insert into the BST.
- Values to check for existence or to remove from the BST.

### Output:

- `insert(value)`: Adds the value to the BST.
- `contains(value)`: Returns `true` if the BST contains the value, `false` otherwise.
- `remove(value)`: Removes the value from the BST if present.
- Operations run on average in O(log n) time, worst-case O(n).

### Example:

```python
bst = BST(10)
bst.insert(5).insert(4).insert(6).insert(15).insert(12).insert(17)

bst.remove(10)
print(bst.contains(10))  # Output: False
```

---

## 🇧🇷 Português

A Árvore Binária de Busca (BST) é uma estrutura de dados que armazena elementos em uma ordem hierárquica, onde cada nó tem até dois filhos: esquerdo e direito. Para cada nó, todos os elementos na subárvore esquerda são menores que o valor do nó, e todos os elementos na subárvore direita são maiores ou iguais.

Essa estrutura permite operações eficientes como inserção, busca (contains) e remoção de valores.

## Entrada:

- Uma série de valores inteiros para inserir na BST.
- Valores para verificar existência ou remover da BST.

## Saída:

- `insert(value)`: Adiciona o valor na BST.
- `contains(value)`: Retorna `true` se a BST contém o valor, `false` caso contrário.
- `remove(value)`: Remove o valor da BST se presente.
- As operações possuem tempo médio O(log n) e pior caso O(n).

## Exemplo:

```python
bst = BST(10)
bst.insert(5).insert(4).insert(6).insert(15).insert(12).insert(17)

bst.remove(10)
print(bst.contains(10))  # Output: False
```

## Response

### Python

```python
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
```
---

### Typescript


```typescript
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
```
