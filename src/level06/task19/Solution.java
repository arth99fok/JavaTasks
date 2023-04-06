package level06.task19;

import java.util.Arrays;

public class Solution {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);
        int index = Arrays.binarySearch(copy, element);
        if (index >= 0) {
            System.out.println("Элемент находится в массиве под индексом: " + index);
        } else {
            System.out.println("Данного элемента нет в массиве");
        }
    }
}
