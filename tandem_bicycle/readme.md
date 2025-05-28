# Tandem Bicycle

## 🇬🇧 English

The problem is to compute the maximum or minimum total speed of tandem bicycles, given two lists of cyclist speeds (red-shirted and blue-shirted).

### Problem Explanation:

You are given two lists representing the speeds of two groups. When forming tandem pairs, the speed of each pair is determined by the faster cyclist.

✅ If you want the fastest total speed, pair the fastest with the slowest.
✅ If you want the slowest total speed, pair matching sorted positions.

### Input:

- `red_shirt_speeds`: an array of integers (speeds).
- `blue_shirt_speeds`: an array of integers (speeds).
- `fastest`: a boolean indicating if you want the fastest or slowest total.

### Output:

- The total speed as an integer.

### Example:

```python
red_shirt_speeds = [5, 5, 3, 9, 2]
blue_shirt_speeds = [3, 6, 7, 2, 1]

tandem_bicycle(red_shirt_speeds, blue_shirt_speeds, True)  # Output: 32
tandem_bicycle(red_shirt_speeds, blue_shirt_speeds, False) # Output: 25
```

---

## 🇧🇷 Português

O problema Tandem Bicycle consiste em calcular a soma total das velocidades ao formar pares de ciclistas em bicicletas tandem, usando dois grupos: um de camisetas vermelhas e outro de camisetas azuis.

### Explicação do Problema

Dadas duas listas com as velocidades dos ciclistas, queremos montar as bicicletas tandem para obter:

✅ A maior velocidade total: combine os mais rápidos de um grupo com os mais lentos do outro.
✅ A menor velocidade total: combine os ciclistas em ordem crescente (posição a posição).

A velocidade de cada tandem é determinada pelo ciclista mais rápido do par.

### Entrada

red_shirt_speeds: array de inteiros com as velocidades dos ciclistas de camisa vermelha.

blue_shirt_speeds: array de inteiros com as velocidades dos ciclistas de camisa azul.

fastest: booleano que indica se devemos calcular a maior (True) ou menor (False) velocidade total.

### Saída

Um número inteiro representando a soma total das velocidades das tandems.

### Exemplo

```python
red_shirt_speeds = [5, 5, 3, 9, 2]
blue_shirt_speeds = [3, 6, 7, 2, 1]

tandem_bicycle(red_shirt_speeds, blue_shirt_speeds, True)  # Output: 32
tandem_bicycle(red_shirt_speeds, blue_shirt_speeds, False) # Output: 25
```
