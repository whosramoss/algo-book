---
name: run_length_encoding
level: easy
---

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

## Response

### Python

```python
def run_length_encoding(string):
  current_run_length = 1
  encoded_string_characteres = []
  for i in range(1, len(string)):
    previous_character = string[i - 1]
    current_character = string[i]
    if current_character != previous_character or current_run_length == 9:
      encoded_string_characteres.append(str(current_run_length))
      encoded_string_characteres.append(previous_character)
      current_run_length = 0
    current_run_length += 1
  encoded_string_characteres.append(str(current_run_length))
  encoded_string_characteres.append(string[len(string) - 1])
  return "".join(encoded_string_characteres)


print(run_length_encoding("aaaaaaaaaaaaaaaaabbbbbbbbbbbbbccccccccccc"))
```
---

### Typescript


```typescript
function runLengthEncoding(str: string): string {
    let currentRunLength = 1;
    let encodedString: string[] = [];

    for (let i = 1; i < str.length; i++) {
        const previousCharacter = str[i - 1];
        const currentCharacter = str[i];

        if (currentCharacter !== previousCharacter || currentRunLength === 9) {
            encodedString.push(currentRunLength.toString());
            encodedString.push(previousCharacter);
            currentRunLength = 0;
        }

        currentRunLength++;
    }

    encodedString.push(currentRunLength.toString());
    encodedString.push(str[str.length - 1]);

    return encodedString.join('');
}

console.log(runLengthEncoding("aaaaaaaaaaaaaaaaabbbbbbbbbbbbbccccccccccc"));
```
