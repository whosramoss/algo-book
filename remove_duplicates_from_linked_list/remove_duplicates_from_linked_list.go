package main

import "fmt"

type LinkedList struct {
    value int
    next  *LinkedList
}

func removeDuplicatesFromLinkedList(linkedList *LinkedList) *LinkedList {
    currentNode := linkedList
    for currentNode != nil {
        if currentNode.next != nil && currentNode.value == currentNode.next.value {
            currentNode.next = currentNode.next.next
        } else {
            currentNode = currentNode.next
        }
    }
    return linkedList
}

func main() {
    linkedList := &LinkedList{value: 1}
    linkedList.next = &LinkedList{value: 1}
    linkedList.next.next = &LinkedList{value: 2}

    linkedList = removeDuplicatesFromLinkedList(linkedList)

    fmt.Println(linkedList.value)        
    fmt.Println(linkedList.next.value)  
}
