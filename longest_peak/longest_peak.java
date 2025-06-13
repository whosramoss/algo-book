public class Main {
  public static int longestPeak(int[] array) {
    int i = 1;
    int longest = 0;

    while (i < array.length - 1) {
      boolean isPeak = array[i] > array[i - 1] && array[i] > array[i + 1];
      if (!isPeak) {
        i++;
        continue;
      }

      int left = i - 2;
      while (left >= 0 && array[left + 1] > array[left]) {
        left--;
      }

      int right = i + 2;
      while (right < array.length && array[right - 1] > array[right]) {
        right++;
      }

      int current = right - left - 1;
      longest = Math.max(longest, current);
      i = right;
    }

    return longest;
  }

  public static void main(String[] args) {
      System.out.println(longestPeak(new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3})); // Output: 6
  }
}
