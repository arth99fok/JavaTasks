package level03.task02;

import java.util.Scanner;

public class Solution {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age >= 18) {
            if (age <= 28) {
                System.out.println(name + militaryCommissar);
            }
        }
    }
}
