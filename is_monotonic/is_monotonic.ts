function isMonotonic(array: number[]): boolean {
  let nonIncreasing = true;
  let nonDecreasing = true;

  for (let i = 1; i < array.length; i++) {
    if (nonIncreasing && array[i - 1] < array[i]) {
      nonIncreasing = false;
    }
    if (nonDecreasing && array[i - 1] > array[i]) {
      nonDecreasing = false;
    }
  }

  return nonIncreasing || nonDecreasing;
}

console.log(isMonotonic([1, 2, 3, 4, 5])); // true
console.log(isMonotonic([5, 5, 5, 4, 3, 2, 1])); // true
console.log(isMonotonic([5, 4, 6, 7, 3])); // false
