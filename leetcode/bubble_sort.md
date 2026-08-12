---
name: bubble_sort
level: easy
---

# Bubble Sort

## 🇬🇧 English

Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process repeats until the list is sorted.

### Time Complexity:
- Best: O(n) time | O(1) space
- Average: O(n²) time | O(1) space
- Worst: O(n²) time | O(1) space

### Input:

- An array of integers `array` to be sorted.

### Output:

- Returns the sorted array in ascending order.

### Example:

```python
print(bubble_sort([5, 1, 10, 20]))
# Output: [1, 5, 10, 20]
```

---

## 🇧🇷 Português

O Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente a lista, compara elementos adjacentes e os troca de posição se estiverem na ordem errada. O processo se repete até que a lista esteja ordenada.

### Complexidade de Tempo:
- Melhor caso: O(n) tempo | O(1) espaço
- Caso médio: O(n²) tempo | O(1) espaço
- Pior caso: O(n²) tempo | O(1) espaço

### Entrada:

- Um array de inteiros `array` a ser ordenado.

### Saída:

- Retorna o array ordenado em ordem crescente.

### Exemplo:

```python
print(bubble_sort([5, 1, 10, 20]))
# Saída: [1, 5, 10, 20]
```

## Response

### Python

```python
# Best: O(n) time | O(1) space
# Average: O(n^2) time | O(1) space
# Worst: O(n^2) time | O(1) space
def bubble_sort(array):
  is_sorted = False
  counter = 0
  while is_sorted is False:
    is_sorted = True
    for i in range(len(array) - 1 - counter):
      if array[i] > array[i + 1]:
        swap(i, i + 1, array)
        is_sorted = False
    counter += 1
  return array

def swap(i, j, array):
  array[i], array[j] = array[j], array[i]


print(bubble_sort([5, 1, 10, 20]))
```
---

### Typescript


```typescript
function bubbleSort(array: number[]): number[] {
  let isSorted = false;
  let counter = 0;

  while (!isSorted) {
      isSorted = true;
      for (let i = 0; i < array.length - 1 - counter; i++) {
          if (array[i] > array[i + 1]) {
              swap(i, i + 1, array);
              isSorted = false;
          }
      }
      counter++;
  }
  return array;
}

function swap(i: number, j: number, array: number[]): void {
  [array[i], array[j]] = [array[j], array[i]];
}

console.log(bubbleSort([5, 1, 10, 20]));
```
