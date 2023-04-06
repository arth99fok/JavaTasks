package level03.task11;

import java.util.Scanner;

public class Solution {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (Math.abs(a - b) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}