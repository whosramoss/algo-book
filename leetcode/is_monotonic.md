---
name: is_monotonic
level: medium
---

# Is Monotonic

## 🇬🇧 English

`isMonotonic` checks whether an array is monotonic. A monotonic array is either entirely non-increasing or non-decreasing.

### Time Complexity:
- O(n) time | O(1) space

### Input:
- `array`: An array of integers.

### Output:
- Returns `true` if the array is monotonic, otherwise `false`.

### Example:
```python
print(is_monotonic([1, 2, 3, 4, 5]))       # True
print(is_monotonic([5, 5, 5, 4, 3, 2, 1])) # True
print(is_monotonic([5, 4, 6, 7, 3]))       # False
```

---

## 🇧🇷 Português

`isMonotonic` verifica se um array é monótono. Um array é considerado monótono se estiver completamente não-crescente ou não-decrescente.

### Complexidade de Tempo:
- O(n) tempo | O(1) espaço

### Entrada:
- `array`: Um array de inteiros.

### Saída:
- Retorna `true` se o array for monótono, caso contrário `false`.

### Exemplo:
```python
print(is_monotonic([1, 2, 3, 4, 5]))       # True
print(is_monotonic([5, 5, 5, 4, 3, 2, 1])) # True
print(is_monotonic([5, 4, 6, 7, 3]))       # False
```

## Response

### Python

```python
def is_monotonic(array): 
  non_increasing = True
  non_decreasing = True

  for i in range(1, len(array)):
    if non_increasing and array[i - 1] < array[i]:
      non_increasing = False
    elif non_decreasing and array[i - 1] > array[i]:
      non_decreasing = False

  return non_increasing or non_decreasing

print(is_monotonic([1, 2, 3, 4, 5]))  # True
print(is_monotonic([5, 5, 5, 4, 3, 2, 1]))  # True
print(is_monotonic([5, 4, 6, 7, 3]))  # False
```
---

### Typescript


```typescript
function isMonotonic(array: number[]): boolean {
  let nonIncreasing = true;
  let nonDecreasing = true;

  for (let i = 1; i < array.length; i++) {
    if (nonIncreasing && array[i - 1] < array[i]) {
      nonIncreasing = false;
    }
    if (nonDecreasing && array[i - 1] > array[i]) {
      nonDecreasing = false;
    }
  }

  return nonIncreasing || nonDecreasing;
}

console.log(isMonotonic([1, 2, 3, 4, 5])); // true
console.log(isMonotonic([5, 5, 5, 4, 3, 2, 1])); // true
console.log(isMonotonic([5, 4, 6, 7, 3])); // false
```
