import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    private int name;
    private List<Node> children;

    public Node(int name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public Node addChild(int name) {
        this.children.add(new Node(name));
        return this;
    }

    public List<Integer> breadthFirstSearch(List<Integer> array) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(this);
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            array.add(currentNode.name);
            for (Node child : currentNode.children) {
                queue.add(child);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Node myTree = new Node(1).addChild(2).addChild(3).addChild(4);
        List<Integer> result = myTree.breadthFirstSearch(new ArrayList<>());
        System.out.println(result);  // Output: [1, 2, 3, 4]
    }
}
