package main

import (
	"fmt"
)

type Node struct {
	Name     string
	Children []*Node
}

func (n *Node) AddChild(name string) *Node {
	child := &Node{Name: name}
	n.Children = append(n.Children, child)
	return n
}

func (n *Node) DepthFirstSearch(array *[]string) []string {
	*array = append(*array, n.Name)
	for _, child := range n.Children {
		child.DepthFirstSearch(array)
	}
	return *array
}

func main() {
	root := &Node{Name: "A"}
	root.AddChild("B").AddChild("C")
	root.Children[0].AddChild("D")

	result := []string{}
	root.DepthFirstSearch(&result)
	fmt.Println(result)
}
