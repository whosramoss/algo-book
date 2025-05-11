import java.util.HashMap;

public class GenerateDocument {
    public static boolean generateDocument(String characters, String document) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : characters.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : document.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(generateDocument("abc", "cab"));
    }
}
