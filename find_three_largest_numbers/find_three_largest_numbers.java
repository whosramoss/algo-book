import java.util.Arrays;

public class FindThreeLargestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        Integer[] threeLargest = {null, null, null};
        for (int num : array) {
            updateLargest(threeLargest, num);
        }
        return Arrays.stream(threeLargest).mapToInt(i -> i).toArray();
    }

    private static void updateLargest(Integer[] threeLargest, int num) {
        if (threeLargest[2] == null || num > threeLargest[2]) {
            shiftAndUpdate(threeLargest, num, 2);
        } else if (threeLargest[1] == null || num > threeLargest[1]) {
            shiftAndUpdate(threeLargest, num, 1);
        } else if (threeLargest[0] == null || num > threeLargest[0]) {
            shiftAndUpdate(threeLargest, num, 0);
        }
    }

    private static void shiftAndUpdate(Integer[] array, int num, int idx) {
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                array[i] = num;
            } else {
                array[i] = array[i + 1];
            }
        }
    }

    public static void main(String[] args) {
        int[] result = findThreeLargestNumbers(new int[]{10, 5, 9, 10, 12});
        System.out.println(Arrays.toString(result));
    }
}
