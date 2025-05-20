package main

import (
	"fmt"
	"sort"
)

func minimumWaitingTime(queries []int) int {
	sort.Ints(queries)
	totalWaitingTime := 0

	for i := 0; i < len(queries); i++ {
		queriesLeft := len(queries) - (i + 1)
		totalWaitingTime += queries[i] * queriesLeft
	}

	return totalWaitingTime
}

func main() {
	queries := []int{3, 2, 1, 2, 6}
	fmt.Println(minimumWaitingTime(queries))
}
