function tandemBicycle(redShirtSpeeds: number[], blueShirtSpeeds: number[], fastest: boolean): number {
    redShirtSpeeds.sort((a, b) => a - b);
    blueShirtSpeeds.sort((a, b) => a - b);

    if (fastest) {
        redShirtSpeeds.reverse();
    }

    let total = 0;
    for (let i = 0; i < redShirtSpeeds.length; i++) {
        total += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
    }
    return total;
}

console.log(tandemBicycle([5, 5, 3, 9, 2], [3, 6, 7, 2, 1], true));
console.log(tandemBicycle([5, 5, 3, 9, 2], [3, 6, 7, 2, 1], false));