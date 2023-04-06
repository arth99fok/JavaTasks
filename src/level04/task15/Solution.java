package level04.task15;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int radius = scanner.nextInt();
        double PI = 3.14;
        int s = (int) PI * radius * radius;
        System.out.println(s);
    }
}
