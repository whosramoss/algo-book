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
