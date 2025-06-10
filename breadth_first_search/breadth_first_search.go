package main

import "fmt"

type Node struct {
	name     int
	children []*Node
}

func NewNode(name int) *Node {
	return &Node{name: name, children: []*Node{}}
}

func (n *Node) AddChild(name int) *Node {
	child := NewNode(name)
	n.children = append(n.children, child)
	return n
}

func (n *Node) BreadthFirstSearch(array *[]int) []int {
	queue := []*Node{n}
	for len(queue) > 0 {
		currentNode := queue[0]
		queue = queue[1:]
		*array = append(*array, currentNode.name)
		for _, child := range currentNode.children {
			queue = append(queue, child)
		}
	}
	return *array
}

func main() {
	myTree := NewNode(1).AddChild(2).AddChild(3).AddChild(4)
	result := myTree.BreadthFirstSearch(&[]int{})
	fmt.Println(result) // Output: [1 2 3 4]
}
