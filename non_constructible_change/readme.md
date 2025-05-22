# Non Constructible Change

## 🇬🇧 English

The problem asks to determine the smallest amount of change that cannot be created using a given set of coins.  
To solve this, the algorithm should find the first number that **cannot** be constructed by summing up any combination of the given coins. This number is the smallest non-constructible change.

### Problem Explanation:

Given an array of coin denominations, the goal is to determine the smallest possible amount of change that cannot be created using any combination of these coins. The solution works by sorting the coins and then iterating through them, incrementally building the change we can create. If we find a coin that is larger than the smallest unconstructible amount, we know that the current amount of change cannot be created.

### Input:

- An array `coins` containing the values of the coin denominations.

### Output:

- Returns an integer representing the smallest **non-constructible** change.

### Example:

```python
coins = [5, 7, 1, 1, 2, 3, 22]
print(non_constructible_change(coins))
```

---

## 🇧🇷 Português

O problema consiste em determinar o menor valor de troco que não pode ser criado usando um conjunto dado de moedas.  
Para resolver isso, o algoritmo deve encontrar o primeiro número que **não pode** ser construído pela soma de qualquer combinação das moedas fornecidas. Esse número é o menor troco não construtível.

### Explicação do Problema:

Dado um array de denominações de moedas, o objetivo é determinar o menor valor de troco que não pode ser criado usando qualquer combinação dessas moedas. A solução funciona ordenando as moedas e, em seguida, iterando por elas, construindo incrementalmente o troco que podemos criar. Se encontramos uma moeda maior que o menor valor não construtível, sabemos que o valor atual de troco não pode ser criado.

### Entrada:

- Um array `coins` contendo os valores das denominações das moedas.

### Saída:

- Retorna um número inteiro representando o menor troco **não construtível**.

### Exemplo:

```python
coins = [5, 7, 1, 1, 2, 3, 22]
print(non_constructible_change(coins))
```
