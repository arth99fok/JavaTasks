package level04.task06;

import java.util.Scanner;

public class Solution {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("enough")) {
                break;
            }
            System.out.println(s);

        }
    }
}
