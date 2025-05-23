# Product Sum

## 🇬🇧 English

The problem requires calculating a special sum for an array that may contain nested arrays. Each number in the array contributes to the sum based on its depth within the nested structure. The deeper an element is nested, the greater its multiplier is.

### Problem Explanation:

Given a nested array of integers and lists, the task is to calculate the sum of all the elements where each element is multiplied by its "depth". The depth is defined as follows:

- The depth of the elements in the outermost array is `1`.
- The depth of elements in nested arrays is increased by `1` for each level of nesting.

### Input:

- An array that can contain integers or other arrays (which can be further nested).
- The depth parameter starts at 1 for the outermost array.

### Output:

- Return the product sum, where each element is multiplied by its depth and the result is accumulated.

### Example:

```python
array = [1, [2, 1]]
print(product_sum(array, 1))
```

---

## 🇧🇷 Português

O problema requer o cálculo de uma soma especial para um array que pode conter arrays aninhados. Cada número no array contribui para a soma com base na sua profundidade dentro da estrutura aninhada. Quanto mais profundo um elemento estiver, maior será o seu multiplicador.

### Explicação do Problema:

Dado um array aninhado de inteiros e listas, a tarefa é calcular a soma de todos os elementos, onde cada elemento é multiplicado pela sua "profundidade". A profundidade é definida da seguinte forma:

- A profundidade dos elementos no array mais externo é `1`.
- A profundidade dos elementos em arrays aninhados aumenta em `1` para cada nível de aninhamento.

### Entrada:

- Um array que pode conter inteiros ou outros arrays (que podem ser mais profundamente aninhados).
- O parâmetro de profundidade começa em `1` para o array mais externo.

### Saída:

- Retorna a soma do produto, onde cada elemento é multiplicado pela sua profundidade e o resultado é acumulado.

### Exemplo:

```python
array = [1, [2, 1]]
print(product_sum(array, 1))
```
