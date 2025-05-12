package main

import "fmt"

// Exponential recursive => O (2 ^ n) time | O(n) space
func getNthFib1(n int) int {
    if n == 1 {
        return 0
    }
    if n == 2 {
        return 1
    }
    return getNthFib1(n-2) + getNthFib1(n-1)
}

// Recursive with memoization => O(n) time | O(n) space
func getNthFib2(n int, memoize map[int]int) int {
    if val, exists := memoize[n]; exists {
        return val
    }
    memoize[n] = getNthFib2(n-2, memoize) + getNthFib2(n-1, memoize)
    return memoize[n]
}

//  Iterative => O(n) time | O(1) space
func getNthFib3(n int) int {
    if n == 1 {
        return 0
    }
    if n == 2 {
        return 1
    }

    lastTwo := [2]int{0, 1}
    fib := 0

    for i := 2; i < n; i++ {
        fib = lastTwo[0] + lastTwo[1]
        lastTwo[0] = lastTwo[1]
        lastTwo[1] = fib
    }

    return fib
}

func main() {
    fmt.Println(getNthFib1(6))  
    fmt.Println(getNthFib2(6, map[int]int{1: 0, 2: 1})) 
    fmt.Println(getNthFib3(6)) 
}
