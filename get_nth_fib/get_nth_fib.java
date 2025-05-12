import java.util.Map;
import java.util.HashMap;

public class Fibonacci {

    // Exponential recursive => O (2 ^ n) time | O(n) space
    public static int getNthFib1(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return getNthFib1(n - 2) + getNthFib1(n - 1);
    }

    // Recursive with memoization => O(n) time | O(n) space
    public static int getNthFib2(int n) {
        Map<Integer, Integer> memoize = new HashMap<>();
        memoize.put(1, 0);
        memoize.put(2, 1);
        return memoHelper(n, memoize);
    }

    private static int memoHelper(int n, Map<Integer, Integer> memoize) {
        if (memoize.containsKey(n)) {
            return memoize.get(n);
        } else {
            int result = memoHelper(n - 2, memoize) + memoHelper(n - 1, memoize);
            memoize.put(n, result);
            return result;
        }
    }

    //  Iterative => O(n) time | O(1) space
    public static int getNthFib3(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        int[] lastTwo = {0, 1};
        int fib = 0;

        for (int i = 2; i < n; i++) {
            fib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        System.out.println(getNthFib1(6));
        System.out.println(getNthFib2(6)); 
        System.out.println(getNthFib3(6));
    }
}
