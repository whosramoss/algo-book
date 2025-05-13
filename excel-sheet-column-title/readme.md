# Excel Column Title

## 🇬🇧 English

Given an integer `columnNumber`,  
implement a function that returns its **corresponding column title** as it appears in an Excel sheet.

Excel columns follow this pattern:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
```

✅ This is similar to converting a number to a **base-26 system**, but with letters instead of digits.  
✅ Excel column labels do **not** have a zero digit, so the encoding is slightly shifted.

### Input:

- An integer `columnNumber` (1 ≤ columnNumber ≤ 2³¹ - 1)

### Output:

- A string representing the Excel column title.

### Example:

```python
print(convertToTitle(1))   # Output: "A"
print(convertToTitle(28))  # Output: "AB"
print(convertToTitle(701)) # Output: "ZY"
```

---

## 🇧🇷 Português

Dado um número inteiro `columnNumber`,  
implemente uma função que retorne o **título da coluna** correspondente conforme aparece em uma planilha do Excel.

As colunas do Excel seguem o seguinte padrão:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
```

✅ Isso é semelhante a converter um número para uma **base 26**, mas usando letras em vez de dígitos.  
✅ O sistema não possui o "zero", então o cálculo é ajustado subtraindo 1 antes de converter.

### Entrada:

- Um número inteiro `columnNumber` (1 ≤ columnNumber ≤ 2³¹ - 1)

### Saída:

- Uma string representando o título da coluna do Excel.

### Exemplo:

```python
print(convertToTitle(1))   # Output: "A"
print(convertToTitle(28))  # Output: "AB"
print(convertToTitle(701)) # Output: "ZY"
```
