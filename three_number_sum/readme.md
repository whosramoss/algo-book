
# Three Number Sum

## 🇬🇧 English

The problem is to find all unique triplets in a list that sum up to a target value.

### Problem Explanation:

You are given a list of integers and a target value. The goal is to find all combinations of three different numbers in the list whose sum equals the target value. The function should return a list of triplets. Each triplet must be in ascending order, and the overall list can be returned in any order.

### Input:

- `array`: a list of integers.
- `target`: an integer representing the target sum value.

### Output:

- Returns a list of lists, where each inner list is a triplet of numbers that sum up to the target value.

### Examples:

```python
print(three_number_sum([1, 2, 3, 4, 5, 6, -9, -10, 12], 12))
# Output: [[-10, 10, 12], [-9, 9, 12], ...] (actual output depends on the list)
```

---

## 🇧🇷 Português

O problema é encontrar todos os trios únicos em uma lista cuja soma seja igual a um valor alvo.

### Explicação do Problema:

Você recebe uma lista de números inteiros e um valor alvo. O objetivo é encontrar todas as combinações de três números diferentes na lista cuja soma seja igual ao valor alvo. A função deve retornar uma lista de trios. Cada trio deve estar em ordem crescente, e a lista geral pode estar em qualquer ordem.

### Entrada:

- `array`: uma lista de números inteiros.
- `target`: um número inteiro representando o valor alvo da soma.

### Saída:

- Retorna uma lista de listas, onde cada lista interna é um trio de números cuja soma seja igual ao valor alvo.

### Exemplos:

```python
print(three_number_sum([1, 2, 3, 4, 5, 6, -9, -10, 12], 12))
# Saída: [[-10, 10, 12], [-9, 9, 12], ...] (a saída exata depende da lista)
```
