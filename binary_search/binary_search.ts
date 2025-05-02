function binarySearch(array: number[], target: number): number {
    let left = 0;
    let right = array.length - 1;

    while (left <= right) {
      const mid = Math.floor((right + left) / 2);
      const potentialMatch = array[mid];

      if (target > potentialMatch) {
        left = mid + 1;
      } else if (target < potentialMatch) {
        right = mid - 1;
      } else {
        return mid;
      }
    }

    return -1;
  }

  console.log(binarySearch([1, 2, 3, 4, 5, 6], 6));
