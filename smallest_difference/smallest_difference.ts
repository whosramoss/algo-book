function smallestDifference(arrayOne: number[], arrayTwo: number[]): number[] {
  let closestPair = [arrayOne[0], arrayTwo[0]];
  let closestDiff = Math.abs(arrayOne[0] - arrayTwo[0]);

  for (const a of arrayOne) {
    for (const b of arrayTwo) {
      const currentDiff = Math.abs(a - b);
      if (currentDiff < closestDiff) {
        closestDiff = currentDiff;
        closestPair = [a, b];
      }
    }
  }

  return closestPair;
}

console.log(smallestDifference([-1, 5, 10, 20, 28, 3], [26, 134, 135, 15, 17]));
// Output: [28, 26]
