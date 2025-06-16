package main

import (
	"fmt"
)

func moveElementToEnd(array []int, toMove int) []int {
	left, right := 0, len(array)-1
	for left < right {
		for left < right && array[right] == toMove {
			right--
		}
		if array[left] == toMove {
			array[left], array[right] = array[right], array[left]
		}
		left++
	}
	return array
}

func main() {
	result := moveElementToEnd([]int{2, 2, 2, 2, 1, 1, 1, 1}, 2)
	fmt.Println(result) // Output: [1 1 1 1 2 2 2 2]
}
