package main

import (
	"fmt"
)

func findThreeLargestNumbers(array []int) [3]int {
	threeLargest := [3]int{-1 << 63, -1 << 63, -1 << 63} // int64 
	for _, num := range array {
		updateLargest(&threeLargest, num)
	}
	return threeLargest
}

func updateLargest(threeLargest *[3]int, num int) {
	if num > threeLargest[2] {
		shiftAndUpdate(threeLargest, num, 2)
	} else if num > threeLargest[1] {
		shiftAndUpdate(threeLargest, num, 1)
	} else if num > threeLargest[0] {
		shiftAndUpdate(threeLargest, num, 0)
	}
}

func shiftAndUpdate(array *[3]int, num int, idx int) {
	for i := 0; i <= idx; i++ {
		if i == idx {
			array[i] = num
		} else {
			array[i] = array[i+1]
		}
	}
}

func main() {
	result := findThreeLargestNumbers([]int{10, 5, 9, 10, 12})
	fmt.Println(result[0], result[1], result[2])
}
