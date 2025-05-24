class LinkedList {
    value: number;
    next: LinkedList | null;

    constructor(value: number) {
        this.value = value;
        this.next = null;
    }

    static removeDuplicatesFromLinkedList(linkedList: LinkedList | null): LinkedList | null {
        let currentNode = linkedList;
        while (currentNode !== null) {
            const nextNode = currentNode.next;
            if (nextNode !== null && currentNode.value === nextNode.value) {
                currentNode.next = nextNode.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return linkedList;
    }
}

const linkedList = new LinkedList(1);
linkedList.next = new LinkedList(1);
linkedList.next.next = new LinkedList(2);

const updatedList = LinkedList.removeDuplicatesFromLinkedList(linkedList);
console.log(updatedList); 
console.log(updatedList?.value); 
console.log(updatedList?.next?.value);
