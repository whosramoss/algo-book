import java.util.*;

public class ThreeNumberSum {
    public static List<List<Integer>> threeNumberSum(int[] array, int target) {
        Arrays.sort(array);
        List<List<Integer>> tripleSums = new ArrayList<>();

        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];

                if (currentSum == target) {
                    tripleSums.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    right--;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return tripleSums;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, -9, -10, 12};
        int target = 12;
        List<List<Integer>> result = threeNumberSum(input, target);
        System.out.println(result);
    }
}
