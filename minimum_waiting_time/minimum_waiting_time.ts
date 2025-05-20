function minimumWaitingTime(queries: number[]): number {
    queries.sort((a, b) => a - b);
    let totalWaitingTime = 0;

    for (let i = 0; i < queries.length; i++) {
        const queriesLeft = queries.length - (i + 1);
        totalWaitingTime += queries[i] * queriesLeft;
    }

    return totalWaitingTime;
}

console.log(minimumWaitingTime([3, 2, 1, 2, 6]));
