# find_three_largest_numbers

## 🇬🇧 English

Given an **array of integers**,  
implement a function to find the **three largest distinct numbers** in the array.

- The function should traverse the array only once (O(n) time).
- It should not use sorting.
- The result should be the three largest numbers in order (smallest to largest among the three).

### Input:

- An array of integers.

### Output:

- An array with the three largest integers, sorted from smallest to largest.

### Example:

```python
array = [10, 5, 9, 10, 12]
result = find_three_largest_numbers(array)
# Output: [10, 10, 12]
```

---

## 🇧🇷 Português

Dado um array de números inteiros,  
implemente uma função para encontrar os **três maiores números distintos** no array.

- O array pode conter números positivos, negativos ou repetidos.
- A função deve retornar os três maiores números ordenados do menor para o maior.
- Se o array contiver menos de três números distintos, retorne apenas os disponíveis.

### Entrada:

- Um array de inteiros, por exemplo: `[10, 5, 9, 10, 12]`

### Saída:

- Um array de três inteiros representando os três maiores números, ordenados.  
  Por exemplo: `[10, 11, 12]`

### Exemplo:

```python
array = [10, 5, 9, 10, 12]
resultado = find_three_largest_numbers(array)
# Resultado: [9, 10, 12]
```
