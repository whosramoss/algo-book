---
name: move_element_to_end
level: medium
---

# Move Element To End

## 🇬🇧 English

`moveElementToEnd` is an algorithm that rearranges the elements of an array so that all instances of a specified value are moved to the end of the array, maintaining the relative order of the other elements as much as possible.

### Time Complexity:
- Best / Average / Worst: O(n) time | O(1) space

### Input:
- `array`: An array of integers.
- `toMove`: An integer value that should be moved to the end of the array.

### Output:
- The same array, with all instances of `toMove` shifted to the end.

### Example:
```python
print(move_element_to_end([2, 2, 2, 2, 1, 1, 1, 1], 2))
# Output: [1, 1, 1, 1, 2, 2, 2, 2]
```

---

## 🇧🇷 Português

`moveElementToEnd` é um algoritmo que reorganiza os elementos de um array de forma que todas as ocorrências de um valor específico sejam movidas para o final do array, mantendo a ordem relativa dos outros elementos sempre que possível.

### Complexidade de Tempo:
- Melhor / Médio / Pior caso: O(n) tempo | O(1) espaço

### Entrada:
- `array`: Um array de inteiros.
- `toMove`: Um valor inteiro que deve ser movido para o final do array.

### Saída:
- O mesmo array, com todas as ocorrências de `toMove` movidas para o final.

### Exemplo:
```python
print(move_element_to_end([2, 2, 2, 2, 1, 1, 1, 1], 2))
# Saída: [1, 1, 1, 1, 2, 2, 2, 2]
```

## Response

### Python

```python
def move_element_to_end(array, to_move):
  left = 0
  right = len(array) - 1
  while left < right:
    while left < right and array[right] == to_move:
      right -= 1
    if array[left] == to_move:
      array[left], array[right] = array[right], array[left]
    left += 1
  return array

print(move_element_to_end([2,2,2,2,1,1,1,1], 2))
```
---

### Typescript


```typescript
function moveElementToEnd(array: number[], toMove: number): number[] {
  let left = 0;
  let right = array.length - 1;

  while (left < right) {
    while (left < right && array[right] === toMove) {
      right--;
    }
    if (array[left] === toMove) {
      [array[left], array[right]] = [array[right], array[left]];
    }
    left++;
  }

  return array;
}

console.log(moveElementToEnd([2, 2, 2, 2, 1, 1, 1, 1], 2));
// Output: [1, 1, 1, 1, 2, 2, 2, 2]
```
