package level04.task18;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double glass = 0.5;
        boolean flag = scanner.nextBoolean();

        if (flag) {
            System.out.println((int) Math.ceil(glass));
        } else {
            System.out.println((int) Math.floor(glass));
        }

    }
}
