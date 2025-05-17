import java.util.List;

public class IsValidSubsequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int seqIndex = 0;

    for (int num : array) {
      if (seqIndex == sequence.size()) {
        break;
      }
      if (num == sequence.get(seqIndex)) { 
        seqIndex++;
      }
    }

    return seqIndex == sequence.size();
  }

  public static void main(String[] args) {
    List<Integer> array = List.of(5, 1, 22, 15, 6, -1, 8, 10);
    List<Integer> sequence = List.of(1, 6, -1, 10);
    System.out.println(isValidSubsequence(array, sequence));
  }
}
