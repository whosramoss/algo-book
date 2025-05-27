import java.util.*;

public class Main {
    public static int[] sortedSquaredArray(int[] array) {
        int[] squaredArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }

    public static void main(String[] args) {
        int[] result = sortedSquaredArray(new int[]{-2, -1, 1, 2, 3});
        System.out.println(Arrays.toString(result)); // [1, 1, 4, 4, 9]
    }
}
