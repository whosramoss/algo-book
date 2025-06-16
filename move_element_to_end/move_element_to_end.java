import java.util.Arrays;

public class Main {
    public static int[] moveElementToEnd(int[] array, int toMove) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            while (left < right && array[right] == toMove) {
                right--;
            }
            if (array[left] == toMove) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            left++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] result = moveElementToEnd(new int[]{2, 2, 2, 2, 1, 1, 1, 1}, 2);
        System.out.println(Arrays.toString(result)); // Output: [1, 1, 1, 1, 2, 2, 2, 2]
    }
}
