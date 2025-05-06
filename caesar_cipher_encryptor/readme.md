
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
