package level03.task03;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int age = scanner.nextInt();

        if (age < 18) {
            if (age >= 6) {
                System.out.println("нужно ходить в школу");
            }
        } else {
            System.out.println("пора в институт");
        }
    }
}
