---
name: find_closest_value_in_bst
level: easy
---

# Find Closest Value in BST

## 🇬🇧 English

Given a **Binary Search Tree (BST)** and a target number,  
implement a function to find the value in the BST that is **closest** to the target.

✅ The BST property guarantees that left child nodes are smaller and right child nodes are larger.  
✅ You can assume there will always be **at least one node** in the tree.  
✅ The function should aim for an efficient traversal (not necessarily visiting all nodes).

### Input:

- A `BST` object (root node), where each node has:

  - an `integer` value,
  - a `left` child (or null),
  - a `right` child (or null).

- An `integer` target.

### Output:

- Returns the integer value in the BST that is closest to the target.

### Example:

```python
bst = BST(10)
bst.left = BST(8)
bst.right = BST(12)
result = find_closest_value_in_bst(bst, 20)
```

---

## 🇧🇷 Português

Dada uma **árvore binária de busca (BST)** e um número alvo,  
implemente uma função para encontrar o valor na BST que é **mais próximo** do alvo.

✅ A propriedade da BST garante que os filhos à esquerda são menores e os filhos à direita são maiores.  
✅ Você pode assumir que sempre haverá **pelo menos um nó** na árvore.  
✅ A função deve buscar uma travessia eficiente (não necessariamente visitando todos os nós).

### Entrada:

- Um objeto `BST` (nó raiz), onde cada nó tem:

  - um valor `inteiro`,
  - um filho `esquerdo` (ou null),
  - um filho `direito` (ou null).

- Um número alvo `inteiro`.

### Saída:

- Retorna o valor inteiro na BST que é mais próximo do número alvo.

### Exemplo:

```python
bst = BST(10)
bst.left = BST(8)
bst.right = BST(12)
resultado = find_closest_value_in_bst(bst, 20)
```

## Response

### Python

```python
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
}

function findClosestValueInBST(tree: BST, target: number): number {
  let currentNode: BST | null = tree;
  let closestValue = currentNode.value;

  while (currentNode !== null) {
      if (Math.abs(currentNode.value - target) < Math.abs(closestValue - target)) {
          closestValue = currentNode.value;
      }
      if (target > currentNode.value) {
          currentNode = currentNode.right;
      } else {
          currentNode = currentNode.left;
      }
  }

  return closestValue;
}

const bst = new BST(10);
bst.left = new BST(8);
bst.right = new BST(12);

console.log(findClosestValueInBST(bst, 20));
```
