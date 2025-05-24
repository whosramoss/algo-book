class LinkedList {
    int value;
    LinkedList next;

    LinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    public static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList currentNode = linkedList;
        while (currentNode != null) {
            LinkedList nextNode = currentNode.next;
            if (nextNode != null && currentNode.value == nextNode.value) {
                currentNode.next = nextNode.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return linkedList;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);
        linkedList.next = new LinkedList(1);
        linkedList.next.next = new LinkedList(2);

        linkedList = removeDuplicatesFromLinkedList(linkedList);

        System.out.println(linkedList.value);
        System.out.println(linkedList.next.value);
    }
}
