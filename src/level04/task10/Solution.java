package level04.task10;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;

        int min = scanner.nextInt();
        int secondMin = scanner.nextInt();

        if (secondMin < min) {
            int tmp = min;
            secondMin = min;
            min = tmp;
        }

        while (flag) {
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n < min) {
                    int tmp = min;
                    min = n;
                    secondMin = min;
                }
            } else {
                flag = false;
            }
        }

        System.out.println(secondMin);
    }
}
