package main

import (
	"fmt"
	"sort"
)

func threeNumberSum(array []int, target int) [][]int {
	sort.Ints(array)
	var tripleSums [][]int

	for i := 0; i < len(array)-2; i++ {
		left := i + 1
		right := len(array) - 1

		for left < right {
			currentSum := array[i] + array[left] + array[right]
			if currentSum == target {
				triplet := []int{array[i], array[left], array[right]}
				tripleSums = append(tripleSums, triplet)
				left++
				right--
			} else if currentSum < target {
				left++
			} else {
				right--
			}
		}
	}

	return tripleSums
}

func main() {
	input := []int{1, 2, 3, 4, 5, 6, -9, -10, 12}
	target := 12
	result := threeNumberSum(input, target)
	fmt.Println(result)
}
