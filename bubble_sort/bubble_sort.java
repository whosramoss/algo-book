import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        boolean isSorted = false;
        int counter = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                    isSorted = false;
                }
            }
            counter++;
        }
        return array;
    }

    private static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] result = bubbleSort(new int[]{5, 1, 10, 20});
        System.out.println(Arrays.toString(result));
    }
}
