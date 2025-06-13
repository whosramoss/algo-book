function longestPeak(array: number[]): number {
  let i = 1;
  let longest = 0;

  while (i < array.length - 1) {
    const isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
    if (!isPeak) {
      i++;
      continue;
    }

    let left = i - 2;
    while (left >= 0 && array[left + 1] > array[left]) {
      left--;
    }

    let right = i + 2;
    while (right < array.length && array[right - 1] > array[right]) {
      right++;
    }

    const current = right - left - 1;
    longest = Math.max(longest, current);
    i = right;
  }

  return longest;
}

console.log(longestPeak([1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3])); // Output: 6
