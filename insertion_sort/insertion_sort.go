package main

import (
    "fmt"
)

func insertionSort(array []int) []int {
    for i := 1; i < len(array); i++ {
        j := i
        for j > 0 && array[j] < array[j-1] {
            swap(j, j-1, array)
            j--
        }
    }
    return array
}

func swap(i, j int, array []int) {
    array[i], array[j] = array[j], array[i]
}

func main() {
    result := insertionSort([]int{10, 9, 8, 7})
    fmt.Println(result)
}
