package level03.task14;

import java.util.Scanner;

public class Solution {
    public static String secret = "AmIGo";
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase(secret)) {
            System.out.println("доступ разрешен");
        } else {
            System.out.println("доступ запрещен");
        }
    }
}
