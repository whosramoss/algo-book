function selectionSort(array: number[]): number[] {
    for (let i = 0; i < array.length; i++) {
        let smallestNumberIdx = i;
        for (let j = i + 1; j < array.length; j++) {
            if (array[smallestNumberIdx] > array[j]) {
                smallestNumberIdx = j;
            }
        }
        swap(smallestNumberIdx, i, array);
    }
    return array;
}

function swap(i: number, j: number, array: number[]): void {
    const temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

const array = [10, 9, 8, 7];
const sortedArray = selectionSort(array);
console.log(sortedArray);
