package level04.task17;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int wind = scanner.nextInt();
        System.out.println(Math.round(wind * 3.6));
    }
}
