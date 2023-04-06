package level04.task08;

import java.util.Scanner;

public class Solution {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        boolean stop = false;
        while (!stop) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num < min) {
                    min = num;
                }
            } else {
                stop = true;
            }
        }
        System.out.println("Минимальное число: " + min);
    }
}
