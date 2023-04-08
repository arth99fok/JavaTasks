package level07.task05;

import java.util.Arrays;

public class Solution {
    
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] tmp = new int[array.length];
        int startIndex = 0;
        for (int i = array.length - 1; i >= 0 ; i--) {
            tmp[startIndex] = array[i];
            startIndex++;
        }
        System.arraycopy(tmp, 0, array, 0, array.length);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
