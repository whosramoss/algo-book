function spiralTraverse(array: number[][]): number[] {
  const output: number[] = [];
  let startCol = 0;
  let startRow = 0;
  let endCol = array[0].length - 1;
  let endRow = array.length - 1;

  while (startCol <= endCol && startRow <= endRow) {
    for (let col = startCol; col <= endCol; col++) {
      output.push(array[startRow][col]);
    }
    for (let row = startRow + 1; row <= endRow; row++) {
      output.push(array[row][endCol]);
    }
    for (let col = endCol - 1; col >= startCol; col--) {
      if (startRow === endRow) break;
      output.push(array[endRow][col]);
    }
    for (let row = endRow - 1; row > startRow; row--) {
      if (startCol === endCol) break;
      output.push(array[row][startCol]);
    }
    startCol++;
    endCol--;
    startRow++;
    endRow--;
  }

  return output;
}

console.log(
  spiralTraverse([
    [1, 2, 3],
    [8, 9, 4],
    [7, 6, 5],
  ])
); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
