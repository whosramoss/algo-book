---
name: tournament_winner
level: easy
---

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

## Response

### Python

```python
# O(N) time where N is the number of competitions O(k) space where K is the number of teams 
def tournament_winner(competitions, results):
  current_best_team = ""
  scores = { current_best_team: 0 }
  HOME_TEAM_WON = 1

  for idx, competition in enumerate(competitions):
    result = results[idx]
    home_team, away_team = competition

    winning_team = home_team if result == HOME_TEAM_WON else away_team

    update_scores(winning_team, 3, scores)

    if scores[winning_team] > scores[current_best_team]:
      current_best_team = winning_team
    
  return current_best_team

def update_scores(team, points, scores):
  if team not in scores:
    scores[team] = 0

  scores[team] += points

competitions = [
  ["HTML", "Java"],
  ["Java", "Python"],
  ["Python", "HTML"],
  ["C#", "Python"],
  ["Java", "C#"],
  ["C#", "HTML"]
]

results = [0, 1, 1, 1, 0, 1]

print(tournament_winner(competitions, results))
```
---

### Typescript


```typescript
function tournamentWinner(competitions: string[][], results: number[]): string {
    const scores: { [key: string]: number } = { "": 0 };
    let currentBestTeam = "";

    for (let i = 0; i < competitions.length; i++) {
        const [homeTeam, awayTeam] = competitions[i];
        const result = results[i];
        const winningTeam = result === 1 ? homeTeam : awayTeam;

        if (!(winningTeam in scores)) {
            scores[winningTeam] = 0;
        }
        scores[winningTeam] += 3;

        if (scores[winningTeam] > scores[currentBestTeam]) {
            currentBestTeam = winningTeam;
        }
    }

    return currentBestTeam;
}

const competitions = [
    ["HTML", "Java"],
    ["Java", "Python"],
    ["Python", "HTML"],
    ["C#", "Python"],
    ["Java", "C#"],
    ["C#", "HTML"]
];
const results = [0, 1, 1, 1, 0, 1];

console.log(tournamentWinner(competitions, results));
```
