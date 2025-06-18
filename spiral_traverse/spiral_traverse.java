import java.util.ArrayList;
import java.util.List;

public class Main {

  public static List<Integer> spiralTraverse(int[][] array) {
    List<Integer> output = new ArrayList<>();
    int startCol = 0;
    int startRow = 0;
    int endCol = array[0].length - 1;
    int endRow = array.length - 1;

    while (startCol <= endCol && startRow <= endRow) {
      for (int col = startCol; col <= endCol; col++) {
          output.add(array[startRow][col]);
      }
      for (int row = startRow + 1; row <= endRow; row++) {
          output.add(array[row][endCol]);
      }
      for (int col = endCol - 1; col >= startCol; col--) {
          if (startRow == endRow) break;
          output.add(array[endRow][col]);
      }
      for (int row = endRow - 1; row > startRow; row--) {
          if (startCol == endCol) break;
          output.add(array[row][startCol]);
      }
      startCol++;
      endCol--;
      startRow++;
      endRow--;
    }

    return output;
  }

  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3},
      {8, 9, 4},
      {7, 6, 5}
    };

    System.out.println(spiralTraverse(matrix)); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
  }
}
