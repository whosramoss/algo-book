import java.util.*;

public class Solution {
  public static List<Integer> findThreeDigitEvenNumbers(int[] digits) {
    Set<Integer> res = new HashSet<>();
    int n = digits.length;

    for (int i = 0; i < n; i++) {
      if (digits[i] == 0) continue;
      for (int j = 0; j < n; j++) {
        if (j == i) continue;
        for (int k = 0; k < n; k++) {
          if (k == i || k == j) continue;
          if (digits[k] % 2 != 0) continue;
          int num = digits[i] * 100 + digits[j] * 10 + digits[k];
          res.add(num);
        }
      }
    }

    List<Integer> result = new ArrayList<>(res);
    Collections.sort(result);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(findThreeDigitEvenNumbers(new int[]{2, 1, 3, 0}));
    // [102, 120, 130, 132, 210, 230, 302, 310, 312, 320]
  }
}
