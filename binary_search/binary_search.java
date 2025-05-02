import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            int potentialMatch = array[mid];

            if (target > potentialMatch) {
                left = mid + 1;
            } else if (target < potentialMatch) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int target = 6;
        int result = binarySearch(numbers, target);
        System.out.println(result);
    }
}
