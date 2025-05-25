public class RunLengthEncoding {

  public static String runLengthEncoding(String str) {
    int currentRunLength = 1;
    StringBuilder encodedString = new StringBuilder();

    for (int i = 1; i < str.length(); i++) {
      char previousCharacter = str.charAt(i - 1);
      char currentCharacter = str.charAt(i);

      if (currentCharacter != previousCharacter || currentRunLength == 9) {
        encodedString.append(currentRunLength).append(previousCharacter);
        currentRunLength = 0;
      }

      currentRunLength++;
    }
    
    encodedString.append(currentRunLength).append(str.charAt(str.length() - 1));
    return encodedString.toString();
  }

  public static void main(String[] args) {
      String input = "aaaaaaaaaaaaaaaaabbbbbbbbbbbbbccccccccccc";
      System.out.println(runLengthEncoding(input));
  }
}
