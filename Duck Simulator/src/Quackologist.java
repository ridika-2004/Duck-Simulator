public class Quackologist implements Observer {
    public void update(String duckName) {
        System.out.println("Observer: " + duckName + " just quacked!");
    }
}
