package level04.task02;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = scanner.nextLine();

        int counter = 0;
        while (counter < 10) {
            System.out.println(name + " любит меня.");
            counter++;
        }
    }
}
