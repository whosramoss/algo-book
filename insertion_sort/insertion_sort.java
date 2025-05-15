import java.util.Arrays;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(j, j - 1, array);
                j--;
            }
        }
        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] result = insertionSort(new int[]{10, 9, 8, 7});
        System.out.println(Arrays.toString(result));
    }
}
