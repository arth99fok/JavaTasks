package level03.task06;

import java.util.Scanner;

public class Solution {

    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
