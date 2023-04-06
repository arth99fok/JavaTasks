package level04.task09;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        boolean stop = false;
        while (!stop) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num > max && num % 2 == 0) {
                    max = num;
                }
            } else {
                stop = true;
            }
        }
        System.out.println("Максимальное число: " + max);
    }
}
