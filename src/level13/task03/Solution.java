package level13.task03;

import java.util.Objects;

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(Objects.equals(first, second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
