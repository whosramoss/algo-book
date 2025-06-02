function threeNumberSum(array: number[], target: number): number[][] {
  array.sort((a, b) => a - b);
  const tripleSums: number[][] = [];

  for (let i = 0; i < array.length - 2; i++) {
    let left = i + 1;
    let right = array.length - 1;

    while (left < right) {
      const currentSum = array[i] + array[left] + array[right];

      if (currentSum === target) {
        tripleSums.push([array[i], array[left], array[right]]);
        left++;
        right--;
      } else if (currentSum < target) {
        left++;
      } else {
        right--;
      }
    }
  }

  return tripleSums;
}

console.log(threeNumberSum([1, 2, 3, 4, 5, 6, -9, -10, 12], 12));
