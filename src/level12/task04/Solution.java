package level12.task04;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        int parse = parse(string);
        System.out.println(parse);
    }

    public static int parse(String string) {
        double d = Double.parseDouble(string);
        return (int) Math.round(d);
    }
}
