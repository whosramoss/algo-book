# Array of Products

Level **Medium**

## 🇬🇧 English

The problem is to return an array where each element is the product of all other elements in the array, except the one at the current index.

### Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

### Problem Explanation:

Given an array of integers, the task is to create a new array where each element is the product of all other elements in the original array. The product at each index should exclude the element at that index.

✅ The product calculation should be done efficiently with two passes through the array.  
✅ The solution should not use division.

### Input:

- An array of integers `array`.

### Output:

- An array where each element is the product of all other elements in the original array.

### Example:

```python
print(array_of_products([5, 1, 4, 2]))  # Output: [8, 40, 10, 20]
```

---

## 🇧🇷 Português

O problema é retornar um array onde cada elemento é o produto de todos os outros elementos no array, exceto o elemento no índice atual.

### Complexidade

- Tempo: O(n)
- Espaço: O(n)

### Explicação do Problema:

Dado um array de inteiros, a tarefa é criar um novo array onde cada elemento é o produto de todos os outros elementos no array original. O produto de cada índice deve excluir o elemento nesse índice.

✅ O cálculo do produto deve ser feito de forma eficiente com duas passagens pelo array.  
✅ A solução não deve usar divisão.

### Entrada:

- Um array de inteiros \`array\`.

### Saída:

- Um array onde cada elemento é o produto de todos os outros elementos no array original.

### Exemplo:

```python
print(array_of_products([5, 1, 4, 2]))  # Saída: [8, 40, 10, 20]
```
