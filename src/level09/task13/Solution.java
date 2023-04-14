package level09.task13;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(6));
    }

    public static int getPowerOfTwo(int power) {
        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power;
        }
    }
}
