---
name: is_palindrome
level: easy
---

# is_palindrome

## 🇬🇧 English

Given a **string**,  
implement a function to check if the string is a **palindrome**.

✅ A palindrome reads the same forwards and backwards.  
✅ For example: "aba", "racecar", and "madam" are palindromes.

### Input:

- A `string` (non-empty).

### Output:

- Returns `true` if the string is a palindrome, otherwise `false`.

### Example:

```python
result = is_palindrome("aba")
# Output: True
```

---

## 🇧🇷 Português

Dada uma **string**,  
implemente uma função para verificar se a string é um **palíndromo**.

✅ Um palíndromo é uma palavra que é lida da mesma forma da esquerda para a direita e da direita para a esquerda.  
✅ Por exemplo: "aba", "arara" e "mirim" são palíndromos.

### Entrada:

- Uma `string` (não vazia).

### Saída:

- Retorna `true` se a string for um palíndromo, caso contrário retorna `false`.

### Exemplo:

```python
resultado = is_palindrome("aba")
# Saída: True
```

## Response

### Python

```python
def is_palindrome(string):
  first_letter_idx = 0
  last_letter_idx = len(string) - 1
  while first_letter_idx <= last_letter_idx:
    if string[first_letter_idx] != string[last_letter_idx]:
      return False
    first_letter_idx += 1
    last_letter_idx -= 1
  return True

print(is_palindrome('aba'))
```
---

### Typescript


```typescript
function isPalindrome(str: string): boolean {
  let firstIdx = 0;
  let lastIdx = str.length - 1;
  while (firstIdx <= lastIdx) {
    if (str[firstIdx] !== str[lastIdx]) {
      return false;
    }
    firstIdx++;
    lastIdx--;
  }
  return true;
}

console.log(isPalindrome("aba"));
```
