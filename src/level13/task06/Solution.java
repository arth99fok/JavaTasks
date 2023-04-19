package level13.task06;

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int digits = 0;
        char[] ch = string.toCharArray();
        for(Character character : ch) {
            if (Character.isDigit(character)) {
                digits++;
            }
        }

        return digits;
    }

    public static int countLetters(String string) {
        int letters = 0;
        char[] ch = string.toCharArray();
        for(Character character : ch) {
            if (Character.isLetter(character)) {
                letters++;
            }
        }

        return letters;
    }

    public static int countSpaces(String string) {
        int spaceChar = 0;
        char[] ch = string.toCharArray();
        for(Character character : ch) {
            if (Character.isSpaceChar(character)) {
                spaceChar++;
            }
        }

        return spaceChar;
    }
}
