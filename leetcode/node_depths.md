---
name: node_depths
level: easy
---

# Node Depths

## 🇬🇧 English

The problem requires calculating the **sum of the depths** of all nodes in a given **Binary Search Tree (BST)**.  
The depth of a node is defined as the number of edges from the root node to that node. The root node has a depth of 0.

✅ The BST property guarantees that left child nodes are smaller and right child nodes are larger.  
✅ You can assume there will always be **at least one node** in the tree.

### Problem Explanation:

Given a **Binary Search Tree** (BST), the task is to compute the **total depth** of all the nodes in the tree.  
This involves traversing through each node and summing up their respective depths.

### Input:

- A `BST` object (root node), where each node has:
  - An `integer` value
  - A `left` child (or `null`)
  - A `right` child (or `null`)

### Output:

- The function should return an integer representing the **sum of depths** of all nodes in the BST.

### Example:

```python
bst = BST(10)
bst.left = BST(8)
bst.right = BST(12)

print(node_depths(bst)) # 4
```

---

## 🇧🇷 Português

O problema requer calcular a **soma das profundidades** de todos os nós em uma **Árvore de Busca Binária (BST)**.  
A profundidade de um nó é definida como o número de arestas a partir do nó raiz até esse nó. O nó raiz tem profundidade 0.

✅ A propriedade da BST garante que os nós filhos à esquerda são menores e os nós filhos à direita são maiores.  
✅ Você pode assumir que sempre haverá **pelo menos um nó** na árvore.

### Explicação do Problema:

Dada uma **Árvore de Busca Binária** (BST), a tarefa é calcular a **profundidade total** de todos os nós na árvore.  
Isso envolve percorrer cada nó e somar as respectivas profundidades.

### Entrada:

- Um objeto `BST` (nó raiz), onde cada nó possui:
  - Um valor **inteiro**
  - Um filho **esquerdo** (ou `nulo`)
  - Um filho **direito** (ou `nulo`)

### Saída:

- A função deve retornar um número inteiro representando a **soma das profundidades** de todos os nós na BST.

### Exemplo:

```python
bst = BST(10)
bst.left = BST(8)
bst.right = BST(12)

print(node_depths(bst)) # 4
```

## Response

### Python

```python
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
```
---

### Typescript


```typescript
class BST {
    value: number;
    left: BST | null;
    right: BST | null;

    constructor(value: number) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

function nodeDepths(root: BST | null, depth: number = 0): number {
    if (root === null) {
        return 0;
    }
    return depth + nodeDepths(root.left, depth + 1) + nodeDepths(root.right, depth + 1);
}

const bst = new BST(10);
bst.left = new BST(8);
bst.right = new BST(12);

console.log(nodeDepths(bst));  
```
