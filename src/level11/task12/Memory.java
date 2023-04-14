package level11.task12;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String[] defMemory = new String[array.length];
        int index = 0;
        for (String s : array) {
            if (s != null) {
                defMemory[index] = s;
                index++;
            }
        }

        System.arraycopy(defMemory, 0, array, 0, array.length);
    }
}

