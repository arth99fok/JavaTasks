package level04.task16;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cups = scanner.nextInt();
        int people = scanner.nextInt();
        System.out.println(cups * 1.0 / people);
    }
}
