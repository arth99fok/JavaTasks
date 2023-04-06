package level04.task03;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        String nums = scanner.nextLine();
        while (!(nums.equalsIgnoreCase("ENTER"))) {
            int n = Integer.parseInt(nums);
            sum += n;
            nums = scanner.nextLine();
        }
        System.out.println(sum);
    }
}
