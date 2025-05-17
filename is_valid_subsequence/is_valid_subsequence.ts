function isValidSubsequence(array: number[], sequence: number[]): boolean {
  if (sequence.length > array.length) {
    return false;
  }

  let seqIndex = 0;
  for (const num of array) {
    if (seqIndex === sequence.length) {
      break;
    }
    if (num === sequence[seqIndex]) {
      seqIndex++;
    }
  }

  return seqIndex === sequence.length;
}

const array = [5, 1, 22, 15, 6, -1, 8, 10];
const sequence = [1, 6, -1, 10];
console.log(isValidSubsequence(array, sequence));
