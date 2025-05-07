import java.util.ArrayList;
import java.util.List;

public class Node {
    String name;
    List<Node> children = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public Node addChild(String name) {
        Node child = new Node(name);
        children.add(child);
        return this;
    }

    public List<String> depthFirstSearch(List<String> array) {
        array.add(this.name);
        for (Node child : children) {
            child.depthFirstSearch(array);
        }
        return array;
    }

    public static void main(String[] args) {
        Node root = new Node("A");
        root.addChild("B").addChild("C");
        root.children.get(0).addChild("D");

        List<String> result = root.depthFirstSearch(new ArrayList<>());
        System.out.println(result);
    }
}
