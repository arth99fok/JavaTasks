package level03.task07;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int age = scanner.nextInt();
        if (age <= 20 || age >= 60) {
            System.out.println("Можно не работать");
        }
    }
}
