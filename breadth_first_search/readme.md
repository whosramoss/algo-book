# Breadth First Search (BFS)

## 🇬🇧 English

Breadth First Search (BFS) is a graph traversal algorithm that explores all nodes at the present depth level before moving on to nodes at the next level. It uses a queue data structure to keep track of nodes to visit next.

### Time Complexity:

- Best / Average / Worst: O(V + E) time | O(V) space  
  (where V = number of vertices, E = number of edges)

### Input:

- A tree or graph node (with children or neighbors).
- An empty array to store the order of visited nodes.

### Output:

- Returns an array with the nodes' names in the order they were visited in BFS.

### Example:

```python
myTree = Node(1).add_child(2).add_child(3).add_child(4)
print(myTree.breadth_first_search([]))
# Output: [1, 2, 3, 4]
```

---

## 🇧🇷 Português

Busca em Largura (Breadth First Search - BFS) é um algoritmo de travessia em grafos ou árvores que explora todos os nós do nível atual antes de avançar para os nós do próximo nível. Ele usa uma fila para controlar os nós a visitar.

### Complexidade de Tempo:

- Melhor / Médio / Pior caso: O(V + E) tempo | O(V) espaço  
  (onde V = número de vértices, E = número de arestas)

### Entrada:

- Um nó de árvore ou grafo (com filhos ou vizinhos).
- Um array vazio para armazenar a ordem dos nós visitados.

### Saída:

- Retorna um array com os nomes dos nós na ordem em que foram visitados pelo BFS.

### Exemplo:

```python
myTree = Node(1).add_child(2).add_child(3).add_child(4)
print(myTree.breadth_first_search([]))
# Saída: [1, 2, 3, 4]
```
