function nonConstructibleChange(coins: number[]): number {
    coins.sort((a, b) => a - b);
    let currentChangeCreated = 0;

    for (const coin of coins) {
      if (coin > currentChangeCreated + 1) {
        return currentChangeCreated + 1;
      }
      currentChangeCreated += coin;
  }

  return currentChangeCreated + 1;
}

const coins = [5, 7, 1, 1, 2, 3, 22];
console.log(nonConstructibleChange(coins));  
