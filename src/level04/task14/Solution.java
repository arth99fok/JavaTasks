package level04.task14;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String s = scanner.nextLine();
        int number = scanner.nextInt();

        do {
            System.out.println(s);
            number--;
        } while (number > 0 && number < 5);
    }
}
