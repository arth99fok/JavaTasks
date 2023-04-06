package level04.task05;

public class Solution {

    public static void main(String[] args) {
        int height = 0;
        while (height < 10) {
            int weight = 0;
            while (weight < 20) {
                if (height == 0 || height == 9) {
                    System.out.print("Б");
                } else if (weight == 0 || weight == 19) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                weight++;
            }
            System.out.println();
            height++;
        }
    }
}
