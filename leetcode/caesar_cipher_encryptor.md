---
name: caesar_cipher_encryptor
level: easy
---

# Caesar Cipher Encryptor

## 🇬🇧 English

A Caesar Cipher is a simple encryption technique where each letter in the input string is shifted by a fixed number of positions down the alphabet.

You are given:
- A lowercase string `string`.
- An integer `key` representing the number of positions to shift.

Write a function that returns a **new encrypted string** where each letter is shifted forward in the alphabet by the `key`. If the shift goes past `'z'`, it wraps around to the beginning of the alphabet.

### Input:

- A string `string` consisting of lowercase letters (`'a'`–`'z'`).
- An integer `key` representing the number of positions to shift.

### Output:

- Returns a new encrypted string after applying the Caesar Cipher.

### Example:

```python
print(caesar_cipher_encryptor('xyz', 2))
# Output: zab
```

---

## 🇧🇷 Português

A Cifra de César é uma técnica simples de criptografia onde cada letra da string de entrada é deslocada um número fixo de posições no alfabeto.

Você recebe:
- Uma string minúscula `string`.
- Um número inteiro `key` representando quantas posições deslocar.

Escreva uma função que retorne uma **nova string criptografada**, onde cada letra foi deslocada no alfabeto conforme o `key`. Se o deslocamento passar de `'z'`, ele volta para o início do alfabeto.

### Entrada:

- Uma string `string` contendo letras minúsculas (`'a'`–`'z'`).
- Um número inteiro `key` representando o número de posições a deslocar.

### Saída:

- Retorna uma nova string criptografada após aplicar a Cifra de César.

### Exemplo:

```python
print(caesar_cipher_encryptor('xyz', 2))
# Saída: zab
```

## Response

### Python

```python
def caesar_cipher_encryptor(string, key):
  new_letters = []
  alphabet = list('abcdefghijklmnopqrstuvwxyz')
  new_key = key % 26
  for letter in string:
    new_letter = get_new_letter(new_key, letter, alphabet)
    new_letters.append(new_letter)
  return "".join(new_letters)

def get_new_letter(key, letter, alphabet):
  new_key = alphabet.index(letter) + key
  return alphabet[new_key % 26]

print(caesar_cipher_encryptor('xyz', 2))
```
---

### Typescript


```typescript
function caesarCipherEncryptor(str: string, key: number): string {
    const newLetters: string[] = [];
    const newKey = key % 26;

    for (const letter of str) {
        const newLetter = getNewLetter(letter, newKey);
        newLetters.push(newLetter);
    }

    return newLetters.join('');
}

function getNewLetter(letter: string, key: number): string {
    const newCharCode = letter.charCodeAt(0) + key;
    return newCharCode <= 122 ? String.fromCharCode(newCharCode) : String.fromCharCode(96 + newCharCode % 122);
}

console.log(caesarCipherEncryptor('xyz', 2));
```
