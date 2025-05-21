package main

import "fmt"

type BST struct {
    value int
    left  *BST
    right *BST
}

func nodeDepths(root *BST, depth int) int {
    if root == nil {
        return 0
    }
    return depth + nodeDepths(root.left, depth+1) + nodeDepths(root.right, depth+1)
}

func main() {
    bst := &BST{value: 10}
    bst.left = &BST{value: 8}
    bst.right = &BST{value: 12}

    fmt.Println(nodeDepths(bst, 0))  // Output: 4
}
