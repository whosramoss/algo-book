public class Main {
    public static boolean isMonotonic(int[] array) {
        boolean nonIncreasing = true;
        boolean nonDecreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (nonIncreasing && array[i - 1] < array[i]) {
                nonIncreasing = false;
            }
            if (nonDecreasing && array[i - 1] > array[i]) {
                nonDecreasing = false;
            }
        }

        return nonIncreasing || nonDecreasing;
    }

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 3, 4, 5}));       // true
        System.out.println(isMonotonic(new int[]{5, 5, 5, 4, 3, 2, 1})); // true
        System.out.println(isMonotonic(new int[]{5, 4, 6, 7, 3}));       // false
    }
}
