package main

import (
    "fmt"
    "sort"
)

func tandemBicycle(redShirtSpeeds, blueShirtSpeeds []int, fastest bool) int {
    sort.Ints(redShirtSpeeds)
    sort.Ints(blueShirtSpeeds)

    if fastest {
        reverse(redShirtSpeeds)
    }

    total := 0
    for i := 0; i < len(redShirtSpeeds); i++ {
        if redShirtSpeeds[i] > blueShirtSpeeds[i] {
            total += redShirtSpeeds[i]
        } else {
            total += blueShirtSpeeds[i]
        }
    }
    return total
}

func reverse(arr []int) {
    for i, j := 0, len(arr)-1; i < j; i, j = i+1, j-1 {
        arr[i], arr[j] = arr[j], arr[i]
    }
}

func main() {
    red := []int{5, 5, 3, 9, 2}
    blue := []int{3, 6, 7, 2, 1}
    fmt.Println(tandemBicycle(red, blue, true))
    fmt.Println(tandemBicycle(red, blue, false))
}