---
name: is_valid_subsequence
level: easy
---

# is_valid_subsequence

## 🇬🇧 English

Given an **array** of integers and a sequence,  
implement a function to check whether the sequence is a **valid subsequence** of the array.

✅ A valid subsequence means all the numbers appear in the same order in the array,  
though they do not need to be contiguous.

### Input:

- An `array` of integers.
- A `sequence` of integers.

### Output:

- Returns `true` if the sequence is a valid subsequence of the array, otherwise returns `false`.

### Example:

```python
array = [5, 1, 22, 15, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]
result = is_valid_subsequence(array, sequence)
# Output: True
```

---

## 🇧🇷 Português

Dado um **array** de inteiros e uma sequência,  
implemente uma função para verificar se a sequência é uma **subsequência válida** do array.

✅ Uma subsequência válida significa que todos os números aparecem na mesma ordem no array,  
embora nem todos os elementos do array precisem estar na subsequência.

### Entrada:

- Um `array` de inteiros.
- Uma `sequence` de inteiros.

### Saída:

- Retorna `true` se a sequência for uma subsequência válida do array, caso contrário retorna `false`.

### Exemplo:

```python
array = [5, 1, 22, 15, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]
resultado = is_valid_subsequence(array, sequence)
# Saída: True
```

## Response

### Python

```python
# O(n) time O(1) space
def is_valid_subsequence(array, sequence):
  if len(sequence) > len(array):
    return False
  
  seq_index = 0

  for i in range(len(array)):
    if seq_index == len(sequence):
      break
    if array[i] == sequence[seq_index]:
      seq_index += 1

  return seq_index == len(sequence)

array = [5, 1, 22, 15, 6, -1, 8, 10]
sequence = [1, 6, -1, 10]
print(is_valid_subsequence(array, sequence))
```
---

### Typescript


```typescript
function isValidSubsequence(array: number[], sequence: number[]): boolean {
  if (sequence.length > array.length) {
    return false;
  }

  let seqIndex = 0;
  for (const num of array) {
    if (seqIndex === sequence.length) {
      break;
    }
    if (num === sequence[seqIndex]) {
      seqIndex++;
    }
  }

  return seqIndex === sequence.length;
}

const array = [5, 1, 22, 15, 6, -1, 8, 10];
const sequence = [1, 6, -1, 10];
console.log(isValidSubsequence(array, sequence));
```
