package level11.task05;

public class Building {
    private String type;

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }

    private void initialize(String type) {
        this.type = type;
    }
}
