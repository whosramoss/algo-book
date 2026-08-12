---
name: binary_search
level: easy
---

# Binary Search

## 🇬🇧 English

Binary Search is a classic algorithm for finding a target value within a sorted array. The search works by repeatedly dividing the search interval in half. If the value of the target is less than the value at the midpoint, the search continues in the lower half, otherwise, it continues in the upper half.

### Complexity

- Time Complexity: O(log n)
- Space Complexity: O(1)

### Input:

- A sorted array `array` of integers.
- An integer `target` that you want to find in the array.

### Output:

- Returns the index of the `target` in the array, or `-1` if the target is not found.

### Example:

```python
print(binary_search([1, 2, 3, 4, 5, 6], 6))
# Output: 5
```

---

## 🇧🇷 Português

A Busca Binária é um algoritmo clássico para encontrar um valor alvo dentro de um array ordenado. A busca funciona dividindo repetidamente o intervalo de busca pela metade. Se o valor do alvo for menor que o valor no ponto médio, a busca continua na metade inferior; caso contrário, continua na metade superior.

# Complexidade

- Tempo (Time Complexity): O(log n)
- Espaço (Space Complexity): O(1)

### Entrada:

- Um array ordenado array de inteiros.
- Um número inteiro target que você deseja encontrar no array.

### Saída:

- Retorna o índice do target no array, ou -1 se o alvo não for encontrado.

### Exemplo:

```python
print(binary_search([1, 2, 3, 4, 5, 6], 6))
# Output: 5
```

## Response

### Python

```python
def binary_search(array, target):
  left = 0
  right = len(array) - 1
  while left <= right:
    mid = (right + left) // 2
    potential_match = array[mid]
    if target > potential_match:
      left = mid + 1
    elif target < potential_match:
      right = mid - 1
    elif target == potential_match:
      return mid
  return -1

print(binary_search([1, 2, 3, 4, 5, 6], 6))
```
---

### Typescript


```typescript
function binarySearch(array: number[], target: number): number {
    let left = 0;
    let right = array.length - 1;

    while (left <= right) {
      const mid = Math.floor((right + left) / 2);
      const potentialMatch = array[mid];

      if (target > potentialMatch) {
        left = mid + 1;
      } else if (target < potentialMatch) {
        right = mid - 1;
      } else {
        return mid;
      }
    }

    return -1;
  }

  console.log(binarySearch([1, 2, 3, 4, 5, 6], 6));
```
