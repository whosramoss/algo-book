class MyNode {
  name: number;
  children: MyNode[];

  constructor(name: number) {
    this.name = name;
    this.children = [];
  }

  addChild(name: number): this {
    this.children.push(new MyNode(name));
    return this;
  }

  breadthFirstSearch(array: number[]): number[] {
    const queue: MyNode[] = [this];
    while (queue.length > 0) {
      const currentMyNode = queue.shift()!;
      array.push(currentMyNode.name);
      for (const child of currentMyNode.children) {
        queue.push(child);
      }
    }
    return array;
  }
}

const myTree = new MyNode(1).addChild(2).addChild(3).addChild(4);
console.log(myTree.breadthFirstSearch([])); // Output: [1, 2, 3, 4]
