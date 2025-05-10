import java.util.*;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingCharacter(String str) {
        Map<Character, Boolean> characters = new HashMap<>();
        for (char c : str.toCharArray()) {
            characters.put(c, !characters.containsKey(c));
        }
        for (int i = 0; i < str.length(); i++) {
            if (characters.get(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("abcdcaf"));
    }
}
