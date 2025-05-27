package main

import (
	"fmt"
	"sort"
)

func sortedSquaredArray(array []int) []int {
	squaredArray := make([]int, len(array))
	for i, value := range array {
		squaredArray[i] = value * value
	}
	sort.Ints(squaredArray)
	return squaredArray
}

func main() {
	result := sortedSquaredArray([]int{-2, -1, 1, 2, 3})
	fmt.Println(result) // [1 1 4 4 9]
}
