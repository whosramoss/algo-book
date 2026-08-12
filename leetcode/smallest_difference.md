---
name: smallest_difference
level: medium
---

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

## Response

### Python

```python
# O(n * m) time | O(1) space
def smallest_difference(array_one, array_two):
  closest_pair = [array_one[0] - array_two[0]]
  closest_to_zero = abs(array_one[0] - array_two[0])
  for i in range(len(array_one)):
    for j in range(len(array_two)):
      current_value = abs(array_one[i] - array_two[j])
      if current_value < closest_to_zero:
        closest_to_zero = current_value
        closest_pair = [array_one[i], array_two[j]]
  return closest_pair

print(smallest_difference([-1, 5, 10, 20, 28, 3], [26, 134, 135, 15, 17]))
```
---

### Typescript


```typescript
function smallestDifference(arrayOne: number[], arrayTwo: number[]): number[] {
  let closestPair = [arrayOne[0], arrayTwo[0]];
  let closestDiff = Math.abs(arrayOne[0] - arrayTwo[0]);

  for (const a of arrayOne) {
    for (const b of arrayTwo) {
      const currentDiff = Math.abs(a - b);
      if (currentDiff < closestDiff) {
        closestDiff = currentDiff;
        closestPair = [a, b];
      }
    }
  }

  return closestPair;
}

console.log(smallestDifference([-1, 5, 10, 20, 28, 3], [26, 134, 135, 15, 17]));
// Output: [28, 26]
```
