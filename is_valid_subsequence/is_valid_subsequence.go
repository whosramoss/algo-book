package main

import (
	"fmt"
)

func isValidSubsequence(array []int, sequence []int) bool {
	if len(sequence) > len(array) {
		return false
	}

	seqIndex := 0
	for _, num := range array {
		if seqIndex == len(sequence) {
			break
		}
		if num == sequence[seqIndex] {
			seqIndex++
		}
	}
	return seqIndex == len(sequence)
}

func main() {
	array := []int{5, 1, 22, 15, 6, -1, 8, 10}
	sequence := []int{1, 6, -1, 10}
	fmt.Println(isValidSubsequence(array, sequence))
}
