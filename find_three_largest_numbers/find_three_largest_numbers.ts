function findThreeLargestNumbers(array: number[]): number[] {
    const threeLargest: (number | null)[] = [null, null, null];
    for (const num of array) {
        updateLargest(threeLargest, num);
    }
    return threeLargest as number[];
}

function updateLargest(threeLargest: (number | null)[], num: number): void {
    if (threeLargest[2] === null || num > threeLargest[2]) {
        shiftAndUpdate(threeLargest, num, 2);
    } else if (threeLargest[1] === null || num > threeLargest[1]) {
        shiftAndUpdate(threeLargest, num, 1);
    } else if (threeLargest[0] === null || num > threeLargest[0]) {
        shiftAndUpdate(threeLargest, num, 0);
    }
}

function shiftAndUpdate(array: (number | null)[], num: number, idx: number): void {
    for (let i = 0; i <= idx; i++) {
        if (i === idx) {
            array[i] = num;
        } else {
            array[i] = array[i + 1];
        }
    }
}

console.log(findThreeLargestNumbers([10, 5, 9, 10, 12]));
