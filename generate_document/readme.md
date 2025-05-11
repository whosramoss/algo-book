# Generate Document

## 🇬🇧 English

Given two strings — one containing a pool of characters and another representing a document —  
implement a function to determine if the document can be generated using the available characters.

✅ Each character in the pool can only be used as many times as it appears.  
✅ If the document needs a character not present in the pool (or needs it more times than available), return `False`.  
✅ The check is **case-sensitive**.

### Input:

- A string `characters` representing the available pool of characters.
- A string `document` representing the text we want to generate.

### Output:

- Returns `True` if the document can be generated; `False` otherwise.

### Example:

```python
characters = "abc"
document = "cab"
result = generate_document(characters, document)
# Output: True
```

---

## 🇧🇷 Português

Dadas duas strings — uma contendo um conjunto de caracteres disponíveis e outra representando um documento —  
implemente uma função para determinar se o documento pode ser gerado usando os caracteres disponíveis.

✅ Cada caractere disponível só pode ser usado tantas vezes quanto aparece.  
✅ Se o documento precisar de um caractere que não está disponível (ou precisar dele mais vezes do que existe), retorne `False`.  
✅ A verificação é **sensível a maiúsculas/minúsculas**.

### Entrada:

- Uma string `characters` representando os caracteres disponíveis.
- Uma string `document` representando o texto que queremos gerar.

### Saída:

- Retorna `True` se o documento puder ser gerado; `False` caso contrário.

### Exemplo:

```python
characters = "abc"
document = "cab"
resultado = generate_document(characters, document)
# Saída: True
```
