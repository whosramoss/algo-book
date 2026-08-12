---
name: longest_peak
level: medium
---

# Longest Peak

## 🇬🇧 English

`longestPeak` finds the length of the longest "peak" in an array of integers. A peak is defined as a sequence where elements strictly increase until a maximum point (the peak), and then strictly decrease.

### Time Complexity:

- O(n) time | O(1) space

### Input:

- `array`: An array of integers.

### Output:

- Returns the length of the longest peak.

### Example:

```python
print(longest_peak([1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]))  # Output: 6
```

## 🇧🇷 Português

`longestPeak` encontra o comprimento do maior "pico" em um array de inteiros. Um pico é definido como uma sequência em que os elementos aumentam estritamente até um ponto máximo (o pico) e depois diminuem estritamente.

### Complexidade de Tempo:

- O(n) tempo | O(1) espaço

### Entrada:

- `array`: Um array de inteiros.

### Saída:

- Retorna o comprimento do maior pico.

### Exemplo:

```python
print(longest_peak([1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3]))  # Saída: 6
```

## Response

### Python

```python
def longest_peak(array):
  i = 1
  longest_peak_length = 0
  while i < len(array) - 1:
    is_peak = array[i] > array[i - 1] and array[i] > array[i + 1]
    if not is_peak:
      i += 1
      continue
    left = i - 2
    while left >= 0 and array[left + 1] > array[left]:
      left -= 1
    right = i + 2
    while right < len(array) and array[right -  1] > array[right]:
      right += 1
    current_peak_length = right - left - 1
    longest_peak_length = max(longest_peak_length, current_peak_length)
    i = right
  return longest_peak_length


print(longest_peak([1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3])) # expect 6
```
---

### Typescript


```typescript
function longestPeak(array: number[]): number {
  let i = 1;
  let longest = 0;

  while (i < array.length - 1) {
    const isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
    if (!isPeak) {
      i++;
      continue;
    }

    let left = i - 2;
    while (left >= 0 && array[left + 1] > array[left]) {
      left--;
    }

    let right = i + 2;
    while (right < array.length && array[right - 1] > array[right]) {
      right++;
    }

    const current = right - left - 1;
    longest = Math.max(longest, current);
    i = right;
  }

  return longest;
}

console.log(longestPeak([1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3])); // Output: 6
```
