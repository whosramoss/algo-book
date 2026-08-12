---
name: spiral_traverse
level: medium
---

# Spiral Traverse

## 🇬🇧 English

### Description

The _Spiral Traverse_ algorithm traverses a 2D matrix in a spiral order, starting from the top-left corner and moving clockwise until all elements are visited.

### Time Complexity:

- O(n) time, where n is the total number of elements in the matrix (rows × columns).

### Space Complexity:

- O(n) space to store the result of the spiral traversal.

### Input

- A matrix (array of arrays) of integers.

### Output

- An array containing all the elements of the matrix in spiral order.

### Example

```python
# 3x3 matrix
[
  [1, 2, 3],
  [8, 9, 4],
  [7, 6, 5]
]

# Expected output
[1, 2, 3, 4, 5, 6, 7, 8, 9]
```

# How it works

1. Initialize four variables defining the boundaries of the unvisited area: startRow, endRow, startCol, endCol.

2. Traverse the matrix in 4 steps:

- From left to right on startRow.
- From top to bottom on endCol.
- From right to left on endRow.
- From bottom to top on startCol.

3. After each loop, adjust the boundaries inward.

4. Repeat until the boundaries cross.

---

## 🇧🇷 Português

### Descrição

O algoritmo _Spiral Traverse_ percorre uma matriz bidimensional em formato espiral, começando pelo canto superior esquerdo e seguindo no sentido horário, até que todos os elementos sejam visitados.

### Complexidade de Tempo:

- O(n) tempo, onde n é o número total de elementos na matriz (linhas × colunas).

### Complexidade de Espaço:

- O(n) espaço para armazenar o resultado da travessia em espiral.

### Entrada

- Uma matriz (array de arrays) de números inteiros.

### Saída

- Um array contendo todos os elementos da matriz na ordem da travessia em espiral.

### Exemplo

```python
# Matriz 3x3
[
  [1, 2, 3],
  [8, 9, 4],
  [7, 6, 5]
]

# Saída esperada
[1, 2, 3, 4, 5, 6, 7, 8, 9]
```

# Funcionamento

1. Inicializa quatro variáveis que definem os limites da área não percorrida: startRow, endRow, startCol, endCol.

2. Percorre a matriz em 4 passos:

- Da esquerda para a direita na linha startRow.
- De cima para baixo na coluna endCol.
- Da direita para a esquerda na linha endRow.
- De baixo para cima na coluna startCol.

3. Após cada volta, ajusta os limites para o próximo ciclo interno.

4. Repete até que os limites se cruzem.

## Response

### Python

```python
# O(n) time O(n) space
def spiral_traverse(array):
  output = []
  start_col = 0
  start_row = 0
  end_col = len(array[0]) - 1
  end_row = len(array) - 1

  while start_col <= end_col and start_row <= end_row:
    for col in range(start_col, end_col + 1):
      output.append(array[start_row][col])
    for row in range(start_row + 1, end_row + 1):
      output.append(array[row][end_col])
    for col in reversed(range(start_col, end_col)):
      if start_row == end_row:
        break
      output.append(array[end_row][col])
    for row in reversed(range(start_row + 1, end_row)):
      if start_col == end_col:
        break
      output.append(array[row][start_col])
    start_col += 1
    end_col -= 1
    start_row += 1
    end_row -= 1

  return output

# expect [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(spiral_traverse([
  [1, 2, 3],
  [8, 9, 4],
  [7, 6, 5]
]))
```
---

### Typescript


```typescript
function spiralTraverse(array: number[][]): number[] {
  const output: number[] = [];
  let startCol = 0;
  let startRow = 0;
  let endCol = array[0].length - 1;
  let endRow = array.length - 1;

  while (startCol <= endCol && startRow <= endRow) {
    for (let col = startCol; col <= endCol; col++) {
      output.push(array[startRow][col]);
    }
    for (let row = startRow + 1; row <= endRow; row++) {
      output.push(array[row][endCol]);
    }
    for (let col = endCol - 1; col >= startCol; col--) {
      if (startRow === endRow) break;
      output.push(array[endRow][col]);
    }
    for (let row = endRow - 1; row > startRow; row--) {
      if (startCol === endCol) break;
      output.push(array[row][startCol]);
    }
    startCol++;
    endCol--;
    startRow++;
    endRow--;
  }

  return output;
}

console.log(
  spiralTraverse([
    [1, 2, 3],
    [8, 9, 4],
    [7, 6, 5],
  ])
); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
```
