package main

import (
	"fmt"
)

func bubbleSort(array []int) []int {
	isSorted := false
	counter := 0

	for !isSorted {
		isSorted = true
		for i := 0; i < len(array)-1-counter; i++ {
			if array[i] > array[i+1] {
				swap(i, i+1, array)
				isSorted = false
			}
		}
		counter++
	}
	return array
}

func swap(i, j int, array []int) {
	array[i], array[j] = array[j], array[i]
}

func main() {
	result := bubbleSort([]int{5, 1, 10, 20})
	fmt.Println(result)
}
