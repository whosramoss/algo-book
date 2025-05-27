function sortedSquaredArray(array: number[]): number[] {
    const squaredArray = array.map(value => value * value);
    squaredArray.sort((a, b) => a - b);
    return squaredArray;
}

console.log(sortedSquaredArray([-2, -1, 1, 2, 3])); // [1, 1, 4, 4, 9]
