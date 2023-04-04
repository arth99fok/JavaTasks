package level06.task06;

import java.util.Scanner;

public class Solution {
    final static Scanner scanner = new Scanner(System.in);
    final static int N = scanner.nextInt();
    final static int[] array = new int[N];

    public static void main(String[] args) {
        int count = 0;
        if (N > 0) {
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
        }

        int max = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
