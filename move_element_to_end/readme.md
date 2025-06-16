# Move Element To End

## 🇬🇧 English

`moveElementToEnd` is an algorithm that rearranges the elements of an array so that all instances of a specified value are moved to the end of the array, maintaining the relative order of the other elements as much as possible.

### Time Complexity:
- Best / Average / Worst: O(n) time | O(1) space

### Input:
- `array`: An array of integers.
- `toMove`: An integer value that should be moved to the end of the array.

### Output:
- The same array, with all instances of `toMove` shifted to the end.

### Example:
```python
print(move_element_to_end([2, 2, 2, 2, 1, 1, 1, 1], 2))
# Output: [1, 1, 1, 1, 2, 2, 2, 2]
```

---

## 🇧🇷 Português

`moveElementToEnd` é um algoritmo que reorganiza os elementos de um array de forma que todas as ocorrências de um valor específico sejam movidas para o final do array, mantendo a ordem relativa dos outros elementos sempre que possível.

### Complexidade de Tempo:
- Melhor / Médio / Pior caso: O(n) tempo | O(1) espaço

### Entrada:
- `array`: Um array de inteiros.
- `toMove`: Um valor inteiro que deve ser movido para o final do array.

### Saída:
- O mesmo array, com todas as ocorrências de `toMove` movidas para o final.

### Exemplo:
```python
print(move_element_to_end([2, 2, 2, 2, 1, 1, 1, 1], 2))
# Saída: [1, 1, 1, 1, 2, 2, 2, 2]
```
