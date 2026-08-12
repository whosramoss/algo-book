---
name: two_number_sum
level: easy
---

# Two Number Sum

## 🇬🇧 English

The problem is to find two numbers in a list that sum up to a target value.

### Problem Explanation:

You are given a list of numbers and a target value. The goal is to find two numbers in the list whose sum equals the target value. If the numbers are found, the function should return those two numbers. If not, it should return an empty list.

### Input:

- `array`: a list of integers.
- `target_sum`: an integer, the target sum value.

### Output:

- Returns a list with two numbers whose sum is equal to the target value.

### Examples:

```python
print(two_number_sum1([1, 2, 3, 4], 5))  # Output: [1, 4]
print(two_number_sum2([10, 20, 30], 70))  # Output: []
print(two_number_sum3([1, 2, 3, 4], 3))  # Output: [1, 2]
print(two_number_sum4([1, 2, 3, 4], 3))  # Output: [1, 2]
```

---

## 🇧🇷 Português

O problema é encontrar dois números em uma lista que somados resultem em um valor alvo.

### Explicação do Problema:

Você recebe uma lista de números e um valor alvo. O objetivo é encontrar dois números na lista cuja soma seja igual ao valor alvo. Se os números forem encontrados, a função deve retornar os dois números. Caso contrário, deve retornar uma lista vazia.

### Entrada:

- `array`: uma lista de números inteiros.
- `target_sum`: um número inteiro, o valor alvo da soma.

### Saída:

- Retorna uma lista com dois números cuja soma seja igual ao valor alvo.

### Exemplos:

```python
print(two_number_sum1([1, 2, 3, 4], 5))  # Saída: [1, 4]
print(two_number_sum2([10, 20, 30], 70))  # Saída: []
print(two_number_sum3([1, 2, 3, 4], 3))  # Saída: [1, 2]
print(two_number_sum4([1, 2, 3, 4], 3))  # Saída: [1, 2]
```

## Response

### Python

```python
# Time complexity O(n^2) - Space complexity O(1)
def two_number_sum1(array, target_sum):
  for i in range(len(array)):
    for j in range(i, len(array)):
      if j != i:
        if (array[i] + array[j]) == target_sum:
          return [array[i], array[j]]
  return []

# Time complexity O(log(n)) - Space complexity O(1)
def two_number_sum2(array, target_number):
  array.sort()
  left = 0
  right = len(array) - 1
  while left < right:
    current_sum = array[left] + array[right]
    if current_sum > target_number:
      right -= 1
    elif current_sum < target_number:
      left += 1
    else:
      return [array[left], array[right]]
  return []

# Time complexity O(n) - Space complexity O(n)
def two_number_sum3(array, target_sum):
  hash_table = {}
  for i in range(len(array)):
    needed_number = target_sum - array[i]
    if hash_table.get(needed_number) != None:
      return [needed_number, array[i]]
    else:
      hash_table[array[i]] = array[i]
  return []

# Time complexity O(n^2) - Space complexity O(1)
def two_number_sum4(array, target_sum):
  for i in range(len(array)):
    needed_number = target_sum - array[i] # target_sum = needed_number + array[i]
    for j in range(i, len(array)):
      if i != j:
        if array[j] == needed_number:
          return [needed_number, array[i]]
  return []

print(two_number_sum1([1, 2, 3, 4], 5))
print(two_number_sum2([1, 2, 3, 4], 5))
print(two_number_sum3([1, 2, 3, 4], 3))
print(two_number_sum4([1, 2, 3, 4], 3))
```
---

### Typescript


```typescript
// Time complexity O(n^2) - Space complexity O(1)
function twoNumberSum1(array: number[], targetSum: number): number[] {
    for (let i = 0; i < array.length; i++) {
        for (let j = i + 1; j < array.length; j++) {
            if (array[i] + array[j] === targetSum) {
                return [array[i], array[j]];
            }
        }
    }
    return [];
}

// Time complexity O(log(n)) - Space complexity O(1)
function twoNumberSum2(array: number[], targetSum: number): number[] {
    array.sort((a, b) => a - b);
    let left = 0, right = array.length - 1;
    while (left < right) {
        const currentSum = array[left] + array[right];
        if (currentSum === targetSum) return [array[left], array[right]];
        else if (currentSum < targetSum) left++;
        else right--;
    }
    return [];
}

// Time complexity O(n) - Space complexity O(n)
function twoNumberSum3(array: number[], targetSum: number): number[] {
    const set = new Set<number>();
    for (const num of array) {
        const needed = targetSum - num;
        if (set.has(needed)) return [needed, num];
        set.add(num);
    }
    return [];
}

// Time complexity O(n^2) - Space complexity O(1)
function twoNumberSum4(array: number[], targetSum: number): number[] {
    for (let i = 0; i < array.length; i++) {
        const needed = targetSum - array[i];
        for (let j = i + 1; j < array.length; j++) {
            if (array[j] === needed) return [array[i], array[j]];
        }
    }
    return [];
}

console.log(twoNumberSum1([1, 2, 3, 4], 5));
console.log(twoNumberSum2([1, 2, 3, 4], 5));
console.log(twoNumberSum3([1, 2, 3, 4], 3));
console.log(twoNumberSum4([1, 2, 3, 4], 3));
```
