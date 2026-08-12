---
name: get_nth_fib
level: easy
---

# Get Nth Number Fibonacci

## 🇬🇧 English

Given a positive integer `n`,  
implement a function to compute the **n-th number** in the Fibonacci sequence.

✅ The Fibonacci sequence starts with `0` (first) and `1` (second).  
✅ Each next number is the sum of the two previous numbers.  
✅ For example: 0, 1, 1, 2, 3, 5, 8, 13, ...

### Input:

- An `integer` n ≥ 1.

### Output:

- Returns the integer representing the n-th Fibonacci number.

### Example:

```python
result = get_nth_fib(6)
# Output: 5 (since sequence is 0, 1, 1, 2, 3, 5...)
```

## 🇧🇷 Português

Dado um número inteiro positivo `n`,  
implemente uma função para calcular o **n-ésimo número** na sequência de Fibonacci.

✅ A sequência de Fibonacci começa com `0` (primeiro) e `1` (segundo).  
✅ Cada número seguinte é a soma dos dois números anteriores.  
✅ Por exemplo: 0, 1, 1, 2, 3, 5, 8, 13, ...

### Entrada:

- Um número inteiro **n** ≥ 1.

### Saída:

- Retorna o número inteiro representando o n-ésimo número de Fibonacci.

### Exemplo:

```python
resultado = get_nth_fib(6)
# Saída: 5 (pois a sequência é 0, 1, 1, 2, 3, 5...)
```

## Response

### Python

```python
# Exponential recursive => O (2 ^ n) time | O(n) space
def get_nth_fib1(n):
  if n == 1:
    return 0
  if n == 2:
    return 1
  return get_nth_fib1(n - 2) + get_nth_fib1(n - 1)

# Recursive with memoization => O(n) time | O(n) space
def get_nth_fib2(n, memoize = { 1:0, 2:1 }):
  if n in memoize:
    return memoize[n]
  else:
    memoize[n] = get_nth_fib2(n - 2, memoize) + get_nth_fib2(n - 1, memoize)
    return memoize[n]

# Iterative => O(n) time | O(1) space
def get_nth_fib3(n):
  if n == 2:
    return 1
  elif n == 1:
    return 0
  
  last_two_fibs = [0, 1]
  for _ in range(2, n):
    fib = last_two_fibs[0] + last_two_fibs[1]
    last_two_fibs[0] = last_two_fibs[1]
    last_two_fibs[1] = fib

  return fib

print(get_nth_fib1(6))
print(get_nth_fib2(6))
print(get_nth_fib3(6))
```
---

### Typescript


```typescript
export class Fibonacci {

    // Exponential recursive => O (2 ^ n) time | O(n) space
    static getNthFib1(n: number): number {
        if (n === 1) return 0;
        if (n === 2) return 1;
        return Fibonacci.getNthFib1(n - 2) + Fibonacci.getNthFib1(n - 1);
    }

    // Recursive with memoization => O(n) time | O(n) space
    static getNthFib2(n: number, memoize: { [key: number]: number } = { 1: 0, 2: 1 }): number {
        if (n in memoize) {
            return memoize[n];
        } else {
            memoize[n] = Fibonacci.getNthFib2(n - 2, memoize) + Fibonacci.getNthFib2(n - 1, memoize);
            return memoize[n];
        }
    }

    //  Iterative => O(n) time | O(1) space
    static getNthFib3(n: number): number {
        if (n === 1) return 0;
        if (n === 2) return 1;

        let lastTwo = [0, 1];
        let fib = 0;

        for (let i = 2; i < n; i++) {
            fib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = fib;
        }

        return fib;
    }
}

console.log(Fibonacci.getNthFib1(6));  
console.log(Fibonacci.getNthFib2(6));
console.log(Fibonacci.getNthFib3(6)); 
```
