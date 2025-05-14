# Find 3-Digit Even Numbers from Digits Array

## 🇬🇧 English

Given an array of **digits** (integers from 0 to 9, possibly with duplicates),  
implement a function to find **all unique 3-digit even numbers** that meet the following criteria:

✅ The number is formed by concatenating **three different indices** from the array.  
✅ The number does **not** start with zero.  
✅ The number is **even**.  
✅ Digits may repeat **only** as many times as they appear in the input.

The result should be returned as a **sorted array** of unique numbers.

### Input:

- A list of integers `digits`, where:
  - Each digit is in the range `[0, 9]`.
  - Digits may contain duplicates.

### Output:

- A list of sorted integers, representing all valid 3-digit even numbers that follow the rules above.

### Example:

```typescript
findEvenNumbers([2, 1, 3, 0]);
// Output: [102,120,130,132,210,230,302,310,312,320]

findEvenNumbers([2, 2, 8, 8, 2]);
// Output: [222,228,282,288,822,828,882]

findEvenNumbers([3, 7, 5]);
// Output: []
```

## 🇧🇷 Português

Dado um array de **dígitos** (números inteiros entre 0 e 9, possivelmente com repetições),  
implemente uma função que encontre **todos os números pares de 3 dígitos únicos** que atendam aos seguintes critérios:

✅ O número é formado pela concatenação de **três índices diferentes** do array.  
✅ O número **não pode começar com zero**.  
✅ O número deve ser **par**.  
✅ Dígitos podem se repetir **somente** se aparecerem mais de uma vez no array.

O resultado deve ser retornado como um **array ordenado** de números únicos.

### Entrada:

- Um array de inteiros `digits`, onde:
  - Cada dígito está no intervalo `[0, 9]`.
  - Pode haver dígitos repetidos.

### Saída:

- Um array ordenado contendo todos os números de 3 dígitos válidos conforme as regras.

### Exemplo:

```python
findEvenNumbers([2,1,3,0])
# Saída: [102,120,130,132,210,230,302,310,312,320]

findEvenNumbers([2,2,8,8,2])
# Saída: [222,228,282,288,822,828,882]

findEvenNumbers([3,7,5])
# Saída: []
```
