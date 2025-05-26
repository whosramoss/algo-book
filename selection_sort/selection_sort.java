public class SelectionSort {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestNumberIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallestNumberIdx] > array[j]) {
                    smallestNumberIdx = j;
                }
            }
            swap(smallestNumberIdx, i, array);
        }
        return array;
    }

    public static void swap(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7};
        int[] sortedArray = selectionSort(array);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
