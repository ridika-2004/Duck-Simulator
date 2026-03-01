public class DuckSimulator {
    public static void main(String[] args) {

        CountingDuckFactory factory = new CountingDuckFactory();

        Quackable mallard = factory.createMallardDuck();
        Quackable redhead = factory.createRedheadDuck();

        ObservableDuck trackedMallard = new ObservableDuck(mallard, "Mallard Duck");

        Quackologist observer = new Quackologist();
        trackedMallard.registerObserver(observer);

        Flock flock = new Flock();
        flock.add(trackedMallard);
        flock.add(redhead);
        flock.add(new GooseAdapter(new Goose()));

        flock.quack();

        System.out.println("Total quacks: " + QuackCounter.getCount());
    }
}
