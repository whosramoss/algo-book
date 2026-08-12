---
name: sorted_squared_array
level: easy
---

# Sorted Squared Array

## 🇬🇧 English

The problem consists of implementing a function that, given a list of integers (which can include negative numbers), returns a new list containing the squares of each number, sorted in ascending order.

### Problem Explanation:

You are given an array of integers.  
Your task is to:
✅ Square each number,  
✅ Sort the squared numbers,  
✅ Return the sorted array.

### Input:

- An `array` of integers (can be negative or positive).

### Output:

- An array of integers representing the sorted squares.

### Example:

```python
input = [-2, -1, 1, 2, 3]
print(sorted_squared_array(input))  # Output: [1, 1, 4, 4, 9]
```

---

## 🇧🇷 Português

O problema consiste em implementar uma função que, dado um array de números inteiros (que pode incluir números negativos), retorna um novo array contendo os quadrados de cada número, ordenados em ordem crescente.

### Explicação do Problema:

Você recebe um array de inteiros.  
Sua tarefa é:
✅ Elevar cada número ao quadrado,  
✅ Ordenar os números ao quadrado,  
✅ Retornar o array ordenado.

### Entrada:

- Um `array` de números inteiros (podem ser negativos ou positivos).

### Saída:

- Um array de inteiros representando os quadrados ordenados.

### Exemplo:

#### Exemplo 1:

```python
input = [-2, -1, 1, 2, 3]
print(sorted_squared_array(input))  # Saída: [1, 1, 4, 4,]()
```

## Response

### Python

```python
# O(n log(n)) time O(n) space
def sorted_squared_array(array):
  squared_array = []

  for value in array:
    squared_array = squared_array + [value ** 2]

  squared_array.sort()
  return squared_array

print(sorted_squared_array([-2, -1, 1, 2, 3]))
```
---

### Typescript


```typescript
function sortedSquaredArray(array: number[]): number[] {
    const squaredArray = array.map(value => value * value);
    squaredArray.sort((a, b) => a - b);
    return squaredArray;
}

console.log(sortedSquaredArray([-2, -1, 1, 2, 3])); // [1, 1, 4, 4, 9]
```
