package main

import (
	"fmt"
)

type BinaryTree struct {
	Value int
	Left  *BinaryTree
	Right *BinaryTree
}

func BranchSums(root *BinaryTree) []int {
	var sums []int
	calculateBranchSums(root, 0, &sums)
	return sums
}

func calculateBranchSums(node *BinaryTree, runningSum int, sums *[]int) {
	if node == nil {
		return
	}

	newRunningSum := runningSum + node.Value

	if node.Left == nil && node.Right == nil {
		*sums = append(*sums, newRunningSum)
		return
	}

	calculateBranchSums(node.Left, newRunningSum, sums)
	calculateBranchSums(node.Right, newRunningSum, sums)
}

func main() {
	bst := &BinaryTree{Value: 10}
	bst.Left = &BinaryTree{Value: 8}
	bst.Left.Left = &BinaryTree{Value: 7}
	bst.Left.Right = &BinaryTree{Value: 9}
	bst.Right = &BinaryTree{Value: 12}
	bst.Right.Left = &BinaryTree{Value: 11}
	bst.Right.Right = &BinaryTree{Value: 13}

	result := BranchSums(bst)
	fmt.Println(result)
}
