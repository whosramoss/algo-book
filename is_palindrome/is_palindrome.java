public class PalindromeChecker {
  public static boolean isPalindrome(String str) {
    int firstIdx = 0;
    int lastIdx = str.length() - 1;
    while (firstIdx <= lastIdx) {
      if (str.charAt(firstIdx) != str.charAt(lastIdx)) {
        return false;
      }
      firstIdx++;
      lastIdx--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isPalindrome("aba"));
  }
}
