public class Main {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    int[] closestPair = new int[]{arrayOne[0], arrayTwo[0]};
    int closestDiff = Math.abs(arrayOne[0] - arrayTwo[0]);

    for (int a : arrayOne) {
      for (int b : arrayTwo) {
        int currentDiff = Math.abs(a - b);
        if (currentDiff < closestDiff) {
          closestDiff = currentDiff;
          closestPair[0] = a;
          closestPair[1] = b;
        }
      }
    }

    return closestPair;
  }

  public static void main(String[] args) {
    int[] result = smallestDifference(
      new int[]{-1, 5, 10, 20, 28, 3},
      new int[]{26, 134, 135, 15, 17}
    );
    System.out.println("[" + result[0] + ", " + result[1] + "]");
  }
}
