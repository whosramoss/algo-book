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
