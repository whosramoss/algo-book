package main
import "fmt"

func binarySearch(array []int, target int) int {
	left := 0
	right := len(array) - 1

	for left <= right {
		mid := (right + left) / 2
		potentialMatch := array[mid]

		if target > potentialMatch {
			left = mid + 1
		} else if target < potentialMatch {
			right = mid - 1
		} else {
			return mid
		}
	}

	return -1
}

func main() {
	numbers := []int{1, 2, 3, 4, 5, 6}
	target := 6
	result := binarySearch(numbers, target)
	fmt.Println(result)
}
