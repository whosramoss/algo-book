# Tournament Winner

## 🇬🇧 English

The problem is to determine which team wins a tournament, given a set of competitions and results.

### Problem Explanation:

You are given a list of matches between two teams and a list of results indicating which team won each match. Each win gives 3 points. The team with the most points at the end is declared the winner.

✅ The competitions list contains pairs [homeTeam, awayTeam].
✅ The results list contains 1 if the home team won, 0 if the away team won.
✅ The score is accumulated, and at the end, the team with the highest score is returned.

### Input:

competitions: a list of lists with strings (team names).

results: a list of integers (0 or 1).

### Output:

A string with the name of the winning team.

### Example:

```python
competitions = [
  ["HTML", "Java"],
  ["Java", "Python"],
  ["Python", "HTML"],
  ["C#", "Python"],
  ["Java", "C#"],
  ["C#", "HTML"]
]

results = [0, 1, 1, 1, 0, 1]

print(tournament_winner(competitions, results))  # Output: "C#"
```

---

## 🇧🇷 Português

O problema consiste em determinar qual time vence um torneio, dado um conjunto de competições e resultados.

### Explicação do Problema:

Você recebe uma lista de partidas entre dois times e uma lista de resultados indicando qual time venceu cada partida. Cada vitória dá 3 pontos. O time com mais pontos ao final é declarado o vencedor.

✅ A lista competitions contém pares [timeCasa, timeVisitante].
✅ A lista results contém 1 se o time da casa venceu, 0 se o time visitante venceu.
✅ A pontuação é acumulada e, no final, o time com a maior pontuação é retornado.

### Entrada:

competitions: uma lista de listas com strings (nomes dos times).

results: uma lista de inteiros (0 ou 1).

### Saída:

Uma string com o nome do time vencedor.
