---
name: selection_sort
level: easy
---

# Selection Sort

## 🇬🇧 English

The problem is to implement the **Selection Sort** algorithm to sort an array of integers.

### Problem Explanation:

The Selection Sort algorithm iterates through the array, finds the smallest element in the unsorted part, and swaps it with the first unsorted element. This process repeats until the array is fully sorted.

### Input:

- An `array` of unsorted integers.

### Output:

- The sorted array of integers.

### Example:

```python
input = [10, 9, 8, 7]
print(selection_sort(input))  # Output: [7, 8, 9, 10]
```

---

## 🇧🇷 Português

O problema consiste em implementar o algoritmo **Selection Sort** para ordenar um array de números inteiros.

### Explicação do Problema:

O algoritmo Selection Sort percorre o array, encontrando o menor elemento da parte não ordenada e trocando-o com o primeiro elemento não ordenado. Esse processo é repetido até que o array esteja completamente ordenado.

### Entrada:

- Um array `array` de números inteiros não ordenados.

### Saída:

- O array ordenado de números inteiros.

### Exemplo:

#### Exemplo 1:

```python
input = [10, 9, 8, 7]
print(selection_sort(input))  # Saída: [7, 8, 9, 10]
```

## Response

### Python

```python
# Best O(n^2) time | O(1) space
# Avarage O(n^2) time | O(1) space
# Worst O(n^2) time | O(1) space
def selection_sort(array):
  for i in range(len(array)):
    j = i
    smallest_number_idx = i
    while j < len(array):
      if array[smallest_number_idx] > array[j]:
        smallest_number_idx = j
      j += 1
    swap(smallest_number_idx, i, array)
  return array


def swap(i, j, array):
  array[i], array[j] = array[j], array[i]

print(selection_sort([10, 9, 8, 7]))
```
---

### Typescript


```typescript
function selectionSort(array: number[]): number[] {
    for (let i = 0; i < array.length; i++) {
        let smallestNumberIdx = i;
        for (let j = i + 1; j < array.length; j++) {
            if (array[smallestNumberIdx] > array[j]) {
                smallestNumberIdx = j;
            }
        }
        swap(smallestNumberIdx, i, array);
    }
    return array;
}

function swap(i: number, j: number, array: number[]): void {
    const temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

const array = [10, 9, 8, 7];
const sortedArray = selectionSort(array);
console.log(sortedArray);
```
