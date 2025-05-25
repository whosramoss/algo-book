# Run Length Encoding

## 🇬🇧 English

The problem is to encode a string using **Run-Length Encoding (RLE)**. In this encoding scheme, consecutive occurrences of the same character are replaced by a single instance of the character followed by the number of times it appears consecutively.

### Problem Explanation:

Given a string, the goal is to produce a new string where each character is followed by the count of its consecutive occurrences. If a character repeats more than 9 times consecutively, it is encoded in a way where the count is limited to 9.

### Input:

- A string `str` where the characters are alphanumeric and may contain consecutive occurrences of the same character.

### Output:

- A string representing the Run-Length Encoding of the input string.

### Example:

```python
input = "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbccccccccccc"
print(run_length_encoding(input))  # Output: "9a1b12c"
```

---

## 🇧🇷 Português

O problema consiste em codificar uma string utilizando a **Codificação de Comprimento de Execução (RLE)**. Nessa codificação, ocorrências consecutivas do mesmo caractere são substituídas por uma única instância do caractere seguida pelo número de vezes que ele aparece consecutivamente.

### Explicação do Problema:

Dada uma string, o objetivo é gerar uma nova string onde cada caractere é seguido pela quantidade de vezes que aparece consecutivamente. Se um caractere se repete mais de 9 vezes consecutivas, a codificação é feita de maneira que o número de repetições é limitado a 9.

### Entrada:

- Uma string `str`, onde os caracteres são alfanuméricos e podem conter ocorrências consecutivas do mesmo caractere.

### Saída:

- Uma string representando a Codificação de Comprimento de Execução (RLE) da string de entrada.

### Exemplo:

```python
input = "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbccccccccccc"
print(run_length_encoding(input))  # Saída: "9a1b12c"
```
