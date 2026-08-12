---
name: first_non_repeating_character
level: easy
---

# First Non Repeating Character

## 🇬🇧 English

Given a **string**,  
implement a function to find the **index** of the first non-repeating (unique) character.

✅ You can assume the string only contains lowercase English letters (a-z).  
✅ If there is no non-repeating character, return `-1`.  
✅ The function should check the characters in order, from left to right.

### Input:

- A `string` of lowercase English letters (ex: `"abcdcaf"`).

### Output:

- Returns the **index** (integer) of the first character that does not repeat in the string.
- Returns `-1` if all characters repeat.

### Example:

```python
string = "abcdcaf"
result = first_non_repeating_character(string)
# Output: 1  (because 'b' is the first unique character)
```

---

## 🇧🇷 Português

Dada uma **string**,  
implemente uma função para encontrar o **índice** do primeiro caractere não repetido (único).

✅ Você pode assumir que a string contém apenas letras minúsculas do alfabeto inglês (a-z).  
✅ Se não houver nenhum caractere não repetido, retorne `-1`.  
✅ A função deve verificar os caracteres em ordem, da esquerda para a direita.

### Entrada:

- Uma `string` de letras minúsculas (ex: `"abcdcaf"`).

### Saída:

- Retorna o **índice** (inteiro) do primeiro caractere que não se repete na string.
- Retorna `-1` se todos os caracteres se repetirem.

### Exemplo:

```python
string = "abcdcaf"
resultado = first_non_repeating_character(string)
# Saída: 1  (porque 'b' é o primeiro caractere único)
```

## Response

### Python

```python
def first_non_repeating_character(string):
  characters = {}
  for character in string:
    if character in characters:
      characters[character] = False
    else:
      characters[character] = True
  for idx, character in enumerate(string):
    if character in characters and characters[character] == True:
      return idx
  return -1

print(first_non_repeating_character("abcdcaf"))
```
---

### Typescript


```typescript
function firstNonRepeatingCharacter(str: string): number {
  const characters: { [key: string]: boolean } = {};
  for (const c of str) {
      characters[c] = characters[c] === undefined;
  }
  for (let i = 0; i < str.length; i++) {
    if (characters[str[i]]) {
      return i;
    }
  }
  return -1;
}

console.log(firstNonRepeatingCharacter("abcdcaf"));
```