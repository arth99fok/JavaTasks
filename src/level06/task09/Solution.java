package level06.task09;

public class Solution {
    final static int row = 10;
    final static int column = 10;

    public static void main(String[] args) {
        int[][] multiTable = new int[row][column];
        for (int i = 0; i < multiTable.length; i++) {
            for (int j = 0; j < multiTable[i].length ; j++) {
                multiTable[i][j] = (i + 1) * (j + 1);
                System.out.print(multiTable[i][j] + " ");
            }
            System.out.println();
        }

    }
}
