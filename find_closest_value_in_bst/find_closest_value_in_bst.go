package main

import (
    "fmt"
    "math"
)

type BST struct {
    Value int
    Left  *BST
    Right *BST
}

func findClosestValueInBST(tree *BST, target int) int {
    currentNode := tree
    closestValue := currentNode.Value

    for currentNode != nil {
        if abs(currentNode.Value-target) < abs(closestValue-target) {
            closestValue = currentNode.Value
        }
        if target > currentNode.Value {
            currentNode = currentNode.Right
        } else {
            currentNode = currentNode.Left
        }
    }
    return closestValue
}

func abs(x int) int {
    return int(math.Abs(float64(x)))
}

func main() {
    bst := &BST{Value: 10}
    bst.Left = &BST{Value: 8}
    bst.Right = &BST{Value: 12}

    fmt.Println(findClosestValueInBST(bst, 20))
}
