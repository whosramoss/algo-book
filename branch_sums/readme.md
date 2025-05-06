
# Branch Sums

## 🇬🇧 English

The problem is to calculate the sum of each branch in a binary tree. A branch is a path from the root to any leaf node, and we want to find the sum of values along each path.

You are given a binary tree where each node has a value and potentially left and right children. Your task is to calculate the sum of each branch.

### Input:

- A binary tree `root`, where each node has a value and left and right children.

### Output:

- Returns a list of sums, where each sum is the total of a branch from the root to a leaf.

### Example:

```python
bst = BinaryTree(10)
bst.left = BinaryTree(8)
bst.left.left = BinaryTree(7)
bst.left.right = BinaryTree(9)
bst.right = BinaryTree(12)
bst.right.left = BinaryTree(11)
bst.right.right = BinaryTree(13)

print(branch_sums(bst))
# Output: [25, 27, 33, 35]
```

---

## 🇧🇷 Português

O problema é calcular a soma de cada ramo em uma árvore binária. Um ramo é um caminho da raiz até um nó folha, e queremos encontrar a soma dos valores ao longo de cada caminho.

Você recebe uma árvore binária onde cada nó tem um valor e, potencialmente, filhos à esquerda e à direita. Sua tarefa é calcular a soma de cada ramo.

### Entrada:

- Uma árvore binária `root`, onde cada nó tem um valor e filhos à esquerda e à direita.

### Saída:

- Retorna uma lista de somas, onde cada soma é o total de um ramo da raiz até uma folha.

### Exemplo:

```python
bst = BinaryTree(10)
bst.left = BinaryTree(8)
bst.left.left = BinaryTree(7)
bst.left.right = BinaryTree(9)
bst.right = BinaryTree(12)
bst.right.left = BinaryTree(11)
bst.right.right = BinaryTree(13)

print(branch_sums(bst))
# Saída: [25, 27, 33, 35]
```
