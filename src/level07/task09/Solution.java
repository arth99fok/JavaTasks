package level07.task09;

public class Solution {
    public static void main(String[] args) {

    }

    public static long cube(long a){
        return a*a*a;
    }

    public static long ninthDegree(long n) {
        return cube(cube(n));
    }
}
