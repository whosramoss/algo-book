package main

import (
	"fmt"
	"math"
)

func smallestDifference(arrayOne, arrayTwo []int) []int {
	closestPair := []int{arrayOne[0], arrayTwo[0]}
	closestDiff := math.Abs(float64(arrayOne[0] - arrayTwo[0]))

	for _, a := range arrayOne {
		for _, b := range arrayTwo {
			currentDiff := math.Abs(float64(a - b))
			if currentDiff < closestDiff {
				closestDiff = currentDiff
				closestPair = []int{a, b}
			}
		}
	}
	return closestPair
}

func main() {
	fmt.Println(smallestDifference([]int{-1, 5, 10, 20, 28, 3}, []int{26, 134, 135, 15, 17}))
}
