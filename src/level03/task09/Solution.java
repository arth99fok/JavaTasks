package level03.task09;

import java.util.Scanner;

public class Solution {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();

        int max = numberA > numberB ? numberA : numberB;

        System.out.println(max);

    }
}
