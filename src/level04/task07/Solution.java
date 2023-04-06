package level04.task07;

public class Solution {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i <= 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }

}
