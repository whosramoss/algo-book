package main

import "fmt"

func arrayOfProducts(array []int) []int {
    products := make([]int, len(array))
    for i := range products {
        products[i] = 1
    }

    product := 1
    for i := len(array) - 1; i >= 0; i-- {
        products[i] = product
        product *= array[i]
    }

    product = 1
    for i := 0; i < len(array); i++ {
        products[i] *= product
        product *= array[i]
    }

    return products
}

func main() {
    result := arrayOfProducts([]int{5, 1, 4, 2})
    fmt.Println(result)
}
