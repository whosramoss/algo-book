function insertionSort(array: number[]): number[] {
    for (let i = 1; i < array.length; i++) {
        let j = i;
        while (j > 0 && array[j] < array[j - 1]) {
            swap(j, j - 1, array);
            j--;
        }
    }
    return array;
}

function swap(i: number, j: number, array: number[]): void {
    const temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

console.log(insertionSort([10, 9, 8, 7]));
