import java.util.*;

public class TwoNumberSum {
  // Time complexity O(n^2) - Space complexity O(1)
    public static int[] twoNumberSum1(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[]{};
    }

    // Time complexity O(log(n)) - Space complexity O(1)
    public static int[] twoNumberSum2(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0, right = array.length - 1;
        while (left < right) {
            int currentSum = array[left] + array[right];
            if (currentSum == targetSum) return new int[]{array[left], array[right]};
            else if (currentSum < targetSum) left++;
            else right--;
        }
        return new int[]{};
    }

    // Time complexity O(n) - Space complexity O(n)
    public static int[] twoNumberSum3(int[] array, int targetSum) {
        Set<Integer> nums = new HashSet<>();
        for (int num : array) {
            int needed = targetSum - num;
            if (nums.contains(needed)) return new int[]{needed, num};
            nums.add(num);
        }
        return new int[]{};
    }

    public static int[] twoNumberSum4(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            int needed = targetSum - array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == needed) return new int[]{array[i], array[j]};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoNumberSum1(new int[]{1, 2, 3, 4}, 5)));
        System.out.println(Arrays.toString(twoNumberSum2(new int[]{1, 2, 3, 4}, 5)));
        System.out.println(Arrays.toString(twoNumberSum3(new int[]{1, 2, 3, 4}, 3)));
        System.out.println(Arrays.toString(twoNumberSum4(new int[]{1, 2, 3, 4}, 3)));
    }
}