import java.util.*;

public class ClassPhotos {
    public static boolean classPhotos(List<Integer> redShirtHeights, List<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights, Collections.reverseOrder());
        Collections.sort(blueShirtHeights, Collections.reverseOrder());

        String firstRowColor = blueShirtHeights.get(0) < redShirtHeights.get(0) ? "BLUE" : "RED";

        for (int i = 0; i < redShirtHeights.size(); i++) {
            int redHeight = redShirtHeights.get(i);
            int blueHeight = blueShirtHeights.get(i);
            if (firstRowColor.equals("RED")) {
                if (redHeight >= blueHeight) {
                    return false;
                }
            } else {
                if (redHeight <= blueHeight) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> redShirtHeights = Arrays.asList(5, 8, 1, 3, 4);
        List<Integer> blueShirtHeights = Arrays.asList(6, 9, 2, 4, 5);
        System.out.println(classPhotos(redShirtHeights, blueShirtHeights));
    }
}