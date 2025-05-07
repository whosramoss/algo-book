# Depth-First Search (DFS) on Tree

## 🇬🇧 English

Given a tree data structure where each node has a `name` and a list of `children`,  
implement a method to perform a **depth-first search traversal**, which collects all node names in the order they are visited.

The traversal should:
✅ Visit the current node,  
✅ Then visit its first child (and all descendants),  
✅ Then move to the next sibling, and so on.

This is a **recursive traversal**.

### Input:

A `Node` object representing the root of the tree. Each `Node` has:

- A `name` (string),
- A list of `children` (nodes).

### Output:

- A list of strings representing the names of the nodes, in the order they were visited by the depth-first search.

### Example:

```python
# Build the tree:
root = Node("A")
root.add_child("B")
root.add_child("C")
root.children[0].add_child("D")  # B -> D
root.children[0].add_child("E")  # B -> E
root.children[1].add_child("F")  # C -> F

# Perform DFS:
result = root.depth_first_search([])

# Output:
# ['A', 'B', 'D', 'E', 'C', 'F']
```

---

## 🇧🇷 Português

Dado uma estrutura de árvore onde cada nó tem um name (nome) e uma lista de children (filhos),
implemente um método para realizar uma busca em profundidade (DFS), que coleta os nomes de todos os nós na ordem em que são visitados.

A travessia deve:
✅ Visitar o nó atual,
✅ Depois o primeiro filho (e todos os seus descendentes),
✅ Depois passar para o próximo irmão, e assim por diante.

Essa é uma travessia recursiva.

### Entrada:

Um objeto Node representando a raiz da árvore.
Cada Node tem:

- Um name (string),
- Uma lista de children (outros nós).

### Saída:

Uma lista de strings representando os nomes dos nós, na ordem em que foram visitados pela busca em profundidade.

```python
# Build the tree:
root = Node("A")
root.add_child("B")
root.add_child("C")
root.children[0].add_child("D")  # B -> D
root.children[0].add_child("E")  # B -> E
root.children[1].add_child("F")  # C -> F

# Perform DFS:
result = root.depth_first_search([])

# Output:
# ['A', 'B', 'D', 'E', 'C', 'F']
```
