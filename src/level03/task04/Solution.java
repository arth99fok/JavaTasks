package level03.task04;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        boolean isHigh = bodyTemperature > 37;
        boolean isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
