# Smallest Difference

## 🇬🇧 English

The `smallestDifference` function finds the pair of numbers (one from each array) whose absolute difference is closest to zero.

### Time Complexity:

- O(n \* m) time | O(1) space, where n and m are the lengths of the two input arrays.

### Input:

- `arrayOne`: An array of integers.
- `arrayTwo`: Another array of integers.

### Output:

- Returns an array with two numbers, one from each input array, representing the closest pair.

### Example:

```python
print(smallest_difference([-1, 5, 10, 20, 28, 3], [26, 134, 135, 15, 17]))
# Output: [28, 26]
```

A função `smallestDifference` encontra o par de números (um de cada array) cuja diferença absoluta é a menor possível, ou seja, mais próxima de zero.

### Complexidade de Tempo:

- O(n \* m) tempo | O(1) espaço, onde n e m são os tamanhos dos arrays de entrada.

### Entrada:

- `arrayOne`: Um array de inteiros.
- `arrayTwo`: Outro array de inteiros.

### Saída:

- Retorna um array com dois números, um de cada array de entrada, representando o par com a menor diferença.

### Exemplo:

```python
print(smallest_difference([-1, 5, 10, 20, 28, 3], [26, 134, 135, 15, 17]))
# Saída: [28, 26]
```
