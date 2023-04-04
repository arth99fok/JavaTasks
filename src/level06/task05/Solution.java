package level06.task05;

import java.util.Scanner;

public class Solution {
    final static Scanner scanner = new Scanner(System.in);
    final static int N = scanner.nextInt();

    public static void main(String[] args) {

        int[] arr = new int[N];

        if (N > 0) {
            int count = 0;
                while (count < N) {
                    arr[count] = scanner.nextInt();
                    count++;
                }
        } else {
            System.out.println("Please, input correct number");
        }
        
        if (N % 2 != 0) {
            for (int j : arr) {
                System.out.println(j);
            }
        } else {
            for (int i = arr.length - 1; i >= 0 ; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}
