package main

import (
    "fmt"
)

func tournamentWinner(competitions [][]string, results []int) string {
    scores := map[string]int{"": 0}
    currentBestTeam := ""

    for i, competition := range competitions {
        homeTeam := competition[0]
        awayTeam := competition[1]
        result := results[i]
        winningTeam := awayTeam
        if result == 1 {
            winningTeam = homeTeam
        }

        scores[winningTeam] += 3

        if scores[winningTeam] > scores[currentBestTeam] {
            currentBestTeam = winningTeam
        }
    }

    return currentBestTeam
}

func main() {
    competitions := [][]string{
        {"HTML", "Java"},
        {"Java", "Python"},
        {"Python", "HTML"},
        {"C#", "Python"},
        {"Java", "C#"},
        {"C#", "HTML"},
    }
    results := []int{0, 1, 1, 1, 0, 1}

    fmt.Println(tournamentWinner(competitions, results))
}