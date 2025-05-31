// Time complexity O(n^2) - Space complexity O(1)
function twoNumberSum1(array: number[], targetSum: number): number[] {
    for (let i = 0; i < array.length; i++) {
        for (let j = i + 1; j < array.length; j++) {
            if (array[i] + array[j] === targetSum) {
                return [array[i], array[j]];
            }
        }
    }
    return [];
}

// Time complexity O(log(n)) - Space complexity O(1)
function twoNumberSum2(array: number[], targetSum: number): number[] {
    array.sort((a, b) => a - b);
    let left = 0, right = array.length - 1;
    while (left < right) {
        const currentSum = array[left] + array[right];
        if (currentSum === targetSum) return [array[left], array[right]];
        else if (currentSum < targetSum) left++;
        else right--;
    }
    return [];
}

// Time complexity O(n) - Space complexity O(n)
function twoNumberSum3(array: number[], targetSum: number): number[] {
    const set = new Set<number>();
    for (const num of array) {
        const needed = targetSum - num;
        if (set.has(needed)) return [needed, num];
        set.add(num);
    }
    return [];
}

// Time complexity O(n^2) - Space complexity O(1)
function twoNumberSum4(array: number[], targetSum: number): number[] {
    for (let i = 0; i < array.length; i++) {
        const needed = targetSum - array[i];
        for (let j = i + 1; j < array.length; j++) {
            if (array[j] === needed) return [array[i], array[j]];
        }
    }
    return [];
}

console.log(twoNumberSum1([1, 2, 3, 4], 5));
console.log(twoNumberSum2([1, 2, 3, 4], 5));
console.log(twoNumberSum3([1, 2, 3, 4], 3));
console.log(twoNumberSum4([1, 2, 3, 4], 3));
