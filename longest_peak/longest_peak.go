package main

import "fmt"

func longestPeak(array []int) int {
	i := 1
	longest := 0

	for i < len(array)-1 {
		isPeak := array[i] > array[i-1] && array[i] > array[i+1]
		if !isPeak {
			i++
			continue
		}

		left := i - 2
		for left >= 0 && array[left+1] > array[left] {
			left--
		}

		right := i + 2
		for right < len(array) && array[right-1] > array[right] {
			right++
		}

		current := right - left - 1
		if current > longest {
			longest = current
		}
		i = right
	}

	return longest
}

func main() {
	fmt.Println(longestPeak([]int{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3})) // Output: 6
}
