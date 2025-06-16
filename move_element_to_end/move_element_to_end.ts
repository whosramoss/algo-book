function moveElementToEnd(array: number[], toMove: number): number[] {
  let left = 0;
  let right = array.length - 1;

  while (left < right) {
    while (left < right && array[right] === toMove) {
      right--;
    }
    if (array[left] === toMove) {
      [array[left], array[right]] = [array[right], array[left]];
    }
    left++;
  }

  return array;
}

console.log(moveElementToEnd([2, 2, 2, 2, 1, 1, 1, 1], 2));
// Output: [1, 1, 1, 1, 2, 2, 2, 2]
