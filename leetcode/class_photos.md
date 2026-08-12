---
name: class_photos
level: easy
---

# Class Photos

## 🇬🇧 English

At a school, two groups of students — one wearing red shirts and the other wearing blue shirts — are going to take a class photo in two rows: one back row (taller students) and one front row (shorter students).

You are given two lists containing the heights of the students in each group. To arrange the photo, all students wearing the same color shirt must be in the same row (either front or back), and the students in the back row must be **strictly taller** than the students directly in front of them (position by position).

Write a function that determines whether it’s possible to arrange the students in this way.

### Input:

- A list of integers `red_shirt_heights` representing the heights of the red-shirted students.
- A list of integers `blue_shirt_heights` representing the heights of the blue-shirted students.

### Output:

- Returns `True` if it’s possible to arrange the students as described; `False` otherwise.

### Example:

```python
red_shirt_heights = [5, 8, 1, 3, 4]
blue_shirt_heights = [6, 9, 2, 4, 5]
class_photos(red_shirt_heights, blue_shirt_heights)
# Output: True
```

## 🇧🇷 Português

Em uma escola, duas turmas (alunos de camiseta vermelha e alunos de camiseta azul) vão tirar uma foto em duas filas: uma atrás (mais alta) e outra na frente (mais baixa).

Você recebe duas listas com as alturas dos alunos de cada turma. Para formar a foto, todos os alunos de uma cor devem estar em uma fila (frente ou trás) e todos da outra cor na outra fila.

A fila de trás deve ter alunos **estritamente mais altos** que os alunos da frente na mesma posição (ou seja, para cada par na mesma posição, o aluno de trás é mais alto).

Escreva uma função que determine se é possível tirar a foto seguindo essas regras.

### Entrada:

- Uma lista de inteiros `red_shirt_heights` representando as alturas dos alunos de camiseta vermelha.
- Uma lista de inteiros `blue_shirt_heights` representando as alturas dos alunos de camiseta azul.

### Saída:

- Retorna `True` se for possível organizar os alunos conforme descrito; `False` caso contrário.

### Exemplo:

```python
red_shirt_heights = [5, 8, 1, 3, 4]
blue_shirt_heights = [6, 9, 2, 4, 5]
class_photos(red_shirt_heights, blue_shirt_heights)
# Saída: True
```

## Response

### Python

```python
def class_photos(red_shirt_heights, blue_shirt_heights):
  red_shirt_heights.sort(reverse=True)
  blue_shirt_heights.sort(reverse=True)

  first_row_color = "BLUE" if blue_shirt_heights[0] < red_shirt_heights[0] else "RED"

  for idx, red_Shirt_height in enumerate(red_shirt_heights):
    blue_shirt_height = blue_shirt_heights[idx]
    if first_row_color == "RED":
      if red_Shirt_height >= blue_shirt_height:
        return False
    if first_row_color == "BLUE":
      if red_Shirt_height <= blue_shirt_height:
        return False

  return True

red_shirt_heights = [5, 8, 1, 3, 4]
blue_shirt_heights = [6, 9, 2, 4, 5]
print(class_photos(red_shirt_heights, blue_shirt_heights))
```
---

### Typescript


```typescript
function classPhotos(redShirtHeights: number[], blueShirtHeights: number[]): boolean {
  redShirtHeights.sort((a, b) => b - a);
  blueShirtHeights.sort((a, b) => b - a);

  const firstRowColor = blueShirtHeights[0] < redShirtHeights[0] ? "BLUE" : "RED";

  for (let i = 0; i < redShirtHeights.length; i++) {
      const redHeight = redShirtHeights[i];
      const blueHeight = blueShirtHeights[i];
      if (firstRowColor === "RED") {
          if (redHeight >= blueHeight) {
              return false;
          }
      } else {
          if (redHeight <= blueHeight) {
              return false;
          }
      }
  }
  return true;
}

const redShirtHeights = [5, 8, 1, 3, 4];
const blueShirtHeights = [6, 9, 2, 4, 5];
console.log(classPhotos(redShirtHeights, blueShirtHeights));
```
