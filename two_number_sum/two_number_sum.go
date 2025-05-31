package main

import (
    "fmt"
    "sort"
)

// Time complexity O(n^2) - Space complexity O(1)
func twoNumberSum1(array []int, targetSum int) []int {
    for i := 0; i < len(array); i++ {
        for j := i + 1; j < len(array); j++ {
            if array[i]+array[j] == targetSum {
                return []int{array[i], array[j]}
            }
        }
    }
    return []int{}
}

    // Time complexity O(log(n)) - Space complexity O(1)
func twoNumberSum2(array []int, targetSum int) []int {
    sort.Ints(array)
    left, right := 0, len(array)-1
    for left < right {
        currentSum := array[left] + array[right]
        if currentSum == targetSum {
            return []int{array[left], array[right]}
        } else if currentSum < targetSum {
            left++
        } else {
            right--
        }
    }
    return []int{}
}

// Time complexity O(n) - Space complexity O(n)
func twoNumberSum3(array []int, targetSum int) []int {
    m := make(map[int]bool)
    for _, num := range array {
        needed := targetSum - num
        if m[needed] {
            return []int{needed, num}
        }
        m[num] = true
    }
    return []int{}
}

// Time complexity O(n^2) - Space complexity O(1)
func twoNumberSum4(array []int, targetSum int) []int {
    for i := 0; i < len(array); i++ {
        needed := targetSum - array[i]
        for j := i + 1; j < len(array); j++ {
            if array[j] == needed {
                return []int{array[i], array[j]}
            }
        }
    }
    return []int{}
}

func main() {
    fmt.Println(twoNumberSum1([]int{1, 2, 3, 4}, 5))
    fmt.Println(twoNumberSum2([]int{1, 2, 3, 4}, 5))
    fmt.Println(twoNumberSum3([]int{1, 2, 3, 4}, 3))
    fmt.Println(twoNumberSum4([]int{1, 2, 3, 4}, 3))
}