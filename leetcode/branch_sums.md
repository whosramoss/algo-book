---
name: branch_sums
level: easy
---

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

## Response

### Python

```python
def branch_sums(root):
  sums = []
  calculate_branch_sums(root, 0, sums)
  return sums

def calculate_branch_sums(node, running_sum, sums):
  if node is None:
    return
  new_running_sum = running_sum + node.value
  if node.left is None and node.right is None:
    sums.append(new_running_sum)
    return
  calculate_branch_sums(node.left, new_running_sum, sums)
  calculate_branch_sums(node.right, new_running_sum, sums)

class BinaryTree:
  def __init__(self, value) -> None:
      self.value = value
      self.left = None
      self.right = None


bst = BinaryTree(10)
bst.left = BinaryTree(8)
bst.left.left = BinaryTree(7)
bst.left.right = BinaryTree(9)
bst.right = BinaryTree(12)
bst.right.left = BinaryTree(11)
bst.right.right = BinaryTree(13)
print(branch_sums(bst))
```
---

### Typescript


```typescript
class BinaryTree {
  value: number;
  left: BinaryTree | null;
  right: BinaryTree | null;

  constructor(value: number) {
      this.value = value;
      this.left = null;
      this.right = null;
  }
}

function branchSums(root: BinaryTree): number[] {
  const sums: number[] = [];
  calculateBranchSums(root, 0, sums);
  return sums;
}

function calculateBranchSums(node: BinaryTree | null, runningSum: number, sums: number[]): void {
  if (node === null) {
      return;
  }

  const newRunningSum = runningSum + node.value;

  if (node.left === null && node.right === null) {
      sums.push(newRunningSum);
      return;
  }

  calculateBranchSums(node.left, newRunningSum, sums);
  calculateBranchSums(node.right, newRunningSum, sums);
}


const bst = new BinaryTree(10);
bst.left = new BinaryTree(8);
bst.left.left = new BinaryTree(7);
bst.left.right = new BinaryTree(9);
bst.right = new BinaryTree(12);
bst.right.left = new BinaryTree(11);
bst.right.right = new BinaryTree(13);

console.log(branchSums(bst));
```
