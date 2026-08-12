---
name: insertion_sort
level: easy
---

# insertion_sort

## 🇬🇧 English

Given an **array of integers**,  
implement a function to sort it using the **Insertion Sort** algorithm.

✅ The algorithm iterates through the array, and at each step, inserts the current element into its correct position among the previous elements.  
✅ It maintains a “sorted” section on the left as it progresses through the array.  
✅ It’s efficient for small arrays but not very efficient for large arrays (O(n²) in the worst case).

### Input:

- An array of integers, for example: `[10, 9, 8, 7]`.

### Output:

- The same array, but sorted in ascending order, for example: `[7, 8, 9, 10]`.

### Example:

```python
result = insertion_sort([10, 9, 8, 7])
# Output: [7, 8, 9, 10]
```

---

## 🇧🇷 Português

Dado um **array de números inteiros**,
implemente uma função para ordená-lo usando o algoritmo **Insertion Sort** (ordenação por inserção).

✅ O algoritmo percorre o array e, a cada passo, insere o elemento atual na posição correta em relação aos anteriores.
✅ Ele mantém uma parte “ordenada” à esquerda enquanto percorre o array.
✅ É eficiente para arrays pequenos, mas não tão eficiente para arrays grandes (O(n²) no pior caso).

### Entrada:

- Um array de números inteiros, por exemplo: `[10, 9, 8, 7]`.

### Saída:

- O mesmo array, mas ordenado em ordem crescente, por exemplo: `[7, 8, 9, 10]`.

### Exemplo:

```python
resultado = insertion_sort([10, 9, 8, 7])
# Saída: [7, 8, 9, 10]
```

## Response

### Python

```python
# Best: O(n) time | O(1) space
# Average: O(n^2) time | O(1) space
# Worst: O(n^2) time | O(1) space
def insertion_sort(array):
  for i in range(1, len(array)):
    j = i
    while j > 0 and array[j] < array[j - 1]:
      swap(j, j - 1, array)
      j -= 1
  return array

def swap(i, j, array):
  array[i], array[j] = array[j], array[i]

print(insertion_sort([10, 9, 8, 7]))
```
---

### Typescript


```typescript
function insertionSort(array: number[]): number[] {
    for (let i = 1; i < array.length; i++) {
        let j = i;
        while (j > 0 && array[j] < array[j - 1]) {
            swap(j, j - 1, array);
            j--;
        }
    }
    return array;
}

function swap(i: number, j: number, array: number[]): void {
    const temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

console.log(insertionSort([10, 9, 8, 7]));
```
