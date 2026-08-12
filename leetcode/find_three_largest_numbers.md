---
name: find_three_largest_numbers
level: easy
---

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

## Response

### Python

```python
def find_three_largest_numbers(array):
  three_largest = [None, None, None]
  for num in array:
    update_largest(three_largest, num)
  return three_largest

def update_largest(three_largest, num):
  if three_largest[2] is None or num > three_largest[2]:
    shift_and_update(three_largest, num, 2)
  elif three_largest[1] is None or num > three_largest[1]:
    shift_and_update(three_largest, num, 1)
  elif three_largest[0] is None or num > three_largest[0]:
    shift_and_update(three_largest, num, 0)

def shift_and_update(array, num, idx):
  for i in range(idx + 1):
    if i == idx:
      array[i] = num
    else:
      array[i] = array[i + 1]

print(find_three_largest_numbers([10, 5, 9, 10, 12]));
```
---

### Typescript


```typescript
function findThreeLargestNumbers(array: number[]): number[] {
    const threeLargest: (number | null)[] = [null, null, null];
    for (const num of array) {
        updateLargest(threeLargest, num);
    }
    return threeLargest as number[];
}

function updateLargest(threeLargest: (number | null)[], num: number): void {
    if (threeLargest[2] === null || num > threeLargest[2]) {
        shiftAndUpdate(threeLargest, num, 2);
    } else if (threeLargest[1] === null || num > threeLargest[1]) {
        shiftAndUpdate(threeLargest, num, 1);
    } else if (threeLargest[0] === null || num > threeLargest[0]) {
        shiftAndUpdate(threeLargest, num, 0);
    }
}

function shiftAndUpdate(array: (number | null)[], num: number, idx: number): void {
    for (let i = 0; i <= idx; i++) {
        if (i === idx) {
            array[i] = num;
        } else {
            array[i] = array[i + 1];
        }
    }
}

console.log(findThreeLargestNumbers([10, 5, 9, 10, 12]));
```
