function productSum(array: (number | (number | any[])[])[], depth: number = 1): number {
    let sum = 0;
    
    for (const item of array) {
        if (Array.isArray(item)) {
            sum += productSum(item, depth + 1);
        } else {
            sum += item;
        }
    }

    return sum * depth;
}

const array = [1, [2, 1]];

console.log(productSum(array, 1)); 
