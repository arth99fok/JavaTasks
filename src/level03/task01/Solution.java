package level03.task01;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        int t = scanner.nextInt();
        if (t < 0) {
            System.out.println(cold);
        } else {
            System.out.println(warm);
        }
    }
}
