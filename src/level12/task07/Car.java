package level12.task07;

public class Car {

    private Engine engine;

    public class Engine {
        boolean isRunning = false;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }
    }
}
