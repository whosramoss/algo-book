package main

import "fmt"

func selectionSort(array []int) []int {
    for i := 0; i < len(array); i++ {
        smallestNumberIdx := i
        for j := i + 1; j < len(array); j++ {
            if array[smallestNumberIdx] > array[j] {
                smallestNumberIdx = j
            }
        }
        swap(smallestNumberIdx, i, array)
    }
    return array
}

func swap(i, j int, array []int) {
    array[i], array[j] = array[j], array[i]
}

func main() {
    array := []int{10, 9, 8, 7}
    sortedArray := selectionSort(array)
    fmt.Println(sortedArray)
}
