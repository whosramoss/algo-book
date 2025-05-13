public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        int totalLetters = 26;
        int asciiInitCode = 65;

        while (columnNumber > 0) {
            columnNumber--; 
            int charCode = (columnNumber % totalLetters) + asciiInitCode;
            result.insert(0, (char) charCode);
            columnNumber /= totalLetters;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));   // "A"
        System.out.println(convertToTitle(28));  // "AB"
        System.out.println(convertToTitle(701)); // "ZY"
    }
}
