export class Fibonacci {

    // Exponential recursive => O (2 ^ n) time | O(n) space
    static getNthFib1(n: number): number {
        if (n === 1) return 0;
        if (n === 2) return 1;
        return Fibonacci.getNthFib1(n - 2) + Fibonacci.getNthFib1(n - 1);
    }

    // Recursive with memoization => O(n) time | O(n) space
    static getNthFib2(n: number, memoize: { [key: number]: number } = { 1: 0, 2: 1 }): number {
        if (n in memoize) {
            return memoize[n];
        } else {
            memoize[n] = Fibonacci.getNthFib2(n - 2, memoize) + Fibonacci.getNthFib2(n - 1, memoize);
            return memoize[n];
        }
    }

    //  Iterative => O(n) time | O(1) space
    static getNthFib3(n: number): number {
        if (n === 1) return 0;
        if (n === 2) return 1;

        let lastTwo = [0, 1];
        let fib = 0;

        for (let i = 2; i < n; i++) {
            fib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = fib;
        }

        return fib;
    }
}

console.log(Fibonacci.getNthFib1(6));  
console.log(Fibonacci.getNthFib2(6));
console.log(Fibonacci.getNthFib3(6)); 
