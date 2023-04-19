package level13.task12;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = capacity + (capacity / 2);
        String[] strings = new String[capacity];
        System.arraycopy(elements, 0, strings, 0, elements.length);
        elements = strings;

    }

    public String get(int i) {
        return elements[i];
    }

    public int size() {
        return size;
    }

}
