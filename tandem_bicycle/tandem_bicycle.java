import java.util.*;

public class Main {
    public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        if (fastest) {
            reverse(redShirtSpeeds);
        }

        int total = 0;
        for (int i = 0; i < redShirtSpeeds.length; i++) {
            total += Math.max(redShirtSpeeds[i], blueShirtSpeeds[i]);
        }
        return total;
    }

    private static void reverse(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] red = {5, 5, 3, 9, 2};
        int[] blue = {3, 6, 7, 2, 1};
        System.out.println(tandemBicycle(red, blue, true));
        System.out.println(tandemBicycle(red, blue, false));
    }
}