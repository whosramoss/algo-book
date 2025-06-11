package main

import (
	"fmt"
)

func isMonotonic(array []int) bool {
	nonIncreasing := true
	nonDecreasing := true

	for i := 1; i < len(array); i++ {
		if nonIncreasing && array[i-1] < array[i] {
			nonIncreasing = false
		}
		if nonDecreasing && array[i-1] > array[i] {
			nonDecreasing = false
		}
	}

	return nonIncreasing || nonDecreasing
}

func main() {
	fmt.Println(isMonotonic([]int{1, 2, 3, 4, 5}))        // true
	fmt.Println(isMonotonic([]int{5, 5, 5, 4, 3, 2, 1}))  // true
	fmt.Println(isMonotonic([]int{5, 4, 6, 7, 3}))        // false
}
