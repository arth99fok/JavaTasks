package level06.task11;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;
    static int row;
    static int column;
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        row = scanner.nextInt();
        multiArray = new int[row][];
        int counter = 0;
        while (counter < row) {
            column = scanner.nextInt();
            multiArray[counter] = new int[column];
            counter++;
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = 1;
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
