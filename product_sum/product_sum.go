package main

import "fmt"

func productSum(array interface{}, depth int) int {
    sum := 0

    switch v := array.(type) {
    case []interface{}:
        for _, item := range v {
            if nestedArray, ok := item.([]interface{}); ok {
                sum += productSum(nestedArray, depth + 1)
            } else {
                sum += item.(int)
            }
        }
    }

    return sum * depth
}

func main() {
    array := []interface{}{1, []interface{}{2, 1}}
    fmt.Println(productSum(array, 1)) 
}
