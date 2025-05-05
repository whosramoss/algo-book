import java.util.*;

public class CaesarCipher {

    public static String caesarCipherEncryptor(String str, int key) {
        StringBuilder newLetters = new StringBuilder();
        int newKey = key % 26;
        for (char letter : str.toCharArray()) {
            char newLetter = getNewLetter(letter, newKey);
            newLetters.append(newLetter);
        }
        return newLetters.toString();
    }

    private static char getNewLetter(char letter, int key) {
        int newCharCode = letter + key;
        return newCharCode <= 'z' ? (char) newCharCode : (char) ('a' + newCharCode - 'z' - 1);
    }

    public static void main(String[] args) {
        System.out.println(caesarCipherEncryptor("xyz", 2));
    }
}
