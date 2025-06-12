package main

import "fmt"

type BST struct {
	value       int
	left, right *BST
}

func NewBST(value int) *BST {
	return &BST{value: value}
}

func (bst *BST) Insert(value int) *BST {
	current := bst
	for {
		if value < current.value {
			if current.left == nil {
				current.left = NewBST(value)
				break
			} else {
				current = current.left
			}
		} else {
			if current.right == nil {
				current.right = NewBST(value)
				break
			} else {
				current = current.right
			}
		}
	}
	return bst
}

func (bst *BST) Contains(value int) bool {
	current := bst
	for current != nil {
		if value < current.value {
			current = current.left
		} else if value > current.value {
			current = current.right
		} else {
			return true
		}
	}
	return false
}

func (bst *BST) Remove(value int, parent *BST) *BST {
	current := bst
	for current != nil {
		if value < current.value {
			parent = current
			current = current.left
		} else if value > current.value {
			parent = current
			current = current.right
		} else {
			// Node with two children
			if current.left != nil && current.right != nil {
				current.value = current.right.GetMinValue()
				current.right.Remove(current.value, current)
			} else if parent == nil { // root node
				if current.left != nil {
					current.value = current.left.value
					current.right = current.left.right
					current.left = current.left.left
				} else if current.right != nil {
					current.value = current.right.value
					current.left = current.right.left
					current.right = current.right.right
				} else {
					// Single-node tree, do nothing
				}
			} else if parent.left == current {
				if current.left != nil {
					parent.left = current.left
				} else {
					parent.left = current.right
				}
			} else if parent.right == current {
				if current.left != nil {
					parent.right = current.left
				} else {
					parent.right = current.right
				}
			}
			break
		}
	}
	return bst
}

func (bst *BST) GetMinValue() int {
	current := bst
	for current.left != nil {
		current = current.left
	}
	return current.value
}

func main() {
	bst := NewBST(10)
	bst.Insert(5).Insert(4).Insert(6).Insert(15).Insert(12).Insert(17)

	bst.Remove(10, nil)
	fmt.Println(bst.Contains(10)) // false
}
