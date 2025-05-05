function bubbleSort(array: number[]): number[] {
  let isSorted = false;
  let counter = 0;

  while (!isSorted) {
      isSorted = true;
      for (let i = 0; i < array.length - 1 - counter; i++) {
          if (array[i] > array[i + 1]) {
              swap(i, i + 1, array);
              isSorted = false;
          }
      }
      counter++;
  }
  return array;
}

function swap(i: number, j: number, array: number[]): void {
  [array[i], array[j]] = [array[j], array[i]];
}

console.log(bubbleSort([5, 1, 10, 20]));
