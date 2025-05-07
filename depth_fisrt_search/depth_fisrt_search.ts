class MyNode {
    name: string;
    children: MyNode[] = [];

    constructor(name: string) {
        this.name = name;
    }

    addChild(name: string): MyNode {
        const child = new MyNode(name);
        this.children.push(child);
        return this;
    }

    depthFirstSearch(array: string[]): string[] {
        array.push(this.name);
        for (const child of this.children) {
            child.depthFirstSearch(array);
        }
        return array;
    }
}

const root = new MyNode("A");
root.addChild("B").addChild("C");
root.children[0].addChild("D");

console.log(root.depthFirstSearch([]));
