package level06.task08;

import java.util.Scanner;

public class Solution {
    final static Scanner scanner = new Scanner(System.in);
    final static String[] strings = new String[6];

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }


    }
}
